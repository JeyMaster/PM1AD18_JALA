package lopez.armando.reproductormultimedia;

import android.Manifest;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MusicService musicSrv;
    private Intent playIntent;
    private boolean musicBound=false;
    Button btnSiguiente;

    private ServiceConnection musicConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MusicService.MusicBinder binder= (MusicService.MusicBinder)service;
            musicSrv=binder.getService();
            musicSrv.setList(songList);
            musicBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            musicBound=false;
        }
    };

    private ArrayList<Song> songList;
    private int songPlaying=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED){
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);

            }
        }
        songList= new ArrayList<>();
        getSongList();
        btnSiguiente=(Button)findViewById(R.id.btnReproducir);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicSrv.setSong(songPlaying);
                musicSrv.playSong();
                songPlaying++;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(playIntent==null){
            playIntent= new Intent(this,MusicService.class);
             bindService(playIntent,musicConnection,Context.BIND_AUTO_CREATE);
             startService(playIntent);
        }
    }

    public void getSongList(){
        ContentResolver musicResolver=getContentResolver();
        Uri musicUri=MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Cursor musicCursor= musicResolver.query(musicUri,null,null,null,null);

        if (musicCursor!=null&&musicCursor.moveToFirst()){
            int titleColum=musicCursor.getColumnIndex(android.provider.MediaStore.Audio.Media.TITLE);
            int idColum=musicCursor.getColumnIndex(android.provider.MediaStore.Audio.Media._ID);
            int artistColum=musicCursor.getColumnIndex(MediaStore.Audio.Media.ARTIST);

            do {

                long thisId=musicCursor.getLong(idColum);
                String thisTitle=musicCursor.getString(titleColum);
                String thisArtist = musicCursor.getString(artistColum);
                songList.add(new Song(thisId,thisTitle,thisArtist));

            }while (musicCursor.moveToNext());

        }


    }
}
