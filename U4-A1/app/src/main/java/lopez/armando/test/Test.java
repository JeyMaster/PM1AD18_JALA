package lopez.armando.test;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends Activity {
    TextView txtState ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        txtState = (TextView) findViewById(R.id.txtState);
        txtState.setMovementMethod(new ScrollingMovementMethod());
        Toast.makeText(this, "On Create", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on create");
        txtState.setText(txtState.getText()+"\n On create");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on resume");
        txtState.setText(txtState.getText()+"\n On resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restar", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on restart");
        txtState.setText(txtState.getText()+"\n On restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On pause", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on pause");
        txtState.setText(txtState.getText()+"\n On pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on destroy");
        txtState.setText(txtState.getText()+"\n On destroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on start");
        txtState.setText(txtState.getText()+"\n On start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
        Log.d("STATE","on stop");
        txtState.setText(txtState.getText()+"\n On stop");
    }


}
