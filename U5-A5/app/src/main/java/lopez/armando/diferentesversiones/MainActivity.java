package lopez.armando.diferentesversiones;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            Toast.makeText(this, "Esta version es mayor que Android 6 Marshmallow", Toast.LENGTH_LONG).show();
        }

        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.P){
            Toast.makeText(this, "Esta version es menor que Android 9 Pie", Toast.LENGTH_LONG).show();
        }
    }
}
