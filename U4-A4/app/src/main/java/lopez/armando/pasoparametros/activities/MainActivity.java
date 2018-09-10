package lopez.armando.pasoparametros.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import lopez.armando.pasoparametros.Models.Usuario;
import lopez.armando.pasoparametros.R;

public class MainActivity extends Activity {
    public static final int LOGIN_INTENT_CODE = 20;
    public static final int ALUMNOS_INTENT_CODE = 25;

    TextView txtBien,
    txtNombre,
    txtApellidos,
    txtContra,
    txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent loginIntent = new Intent(MainActivity.this,Login.class);
        startActivityForResult(loginIntent,LOGIN_INTENT_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==LOGIN_INTENT_CODE){
            // Programar lo que hay que hacer cuando regrese el usuario y contraseña
            Usuario res = (Usuario)data.getSerializableExtra("resultado");
            if (res!=null){
                txtBien=(TextView)findViewById(R.id.txtBien);
                txtNombre=(TextView)findViewById(R.id.txtNombre);
                txtApellidos=(TextView)findViewById(R.id.txtApellidos);
                txtContra=(TextView)findViewById(R.id.txtContra);
                txtCorreo=(TextView)findViewById(R.id.txtCorreo);

                txtBien.setText(txtBien.getText()+res.getUsuario());
                txtNombre.setText(txtNombre.getText()+res.getNombre());
                txtApellidos.setText(txtApellidos.getText()+res.getApellidos());
                txtCorreo.setText(txtCorreo.getText()+res.getCorreo());
                txtContra.setText(txtContra.getText()+res.getPassword());

                Toast.makeText(this,"Bienvenido Usuario :D" ,Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this,"Datos invalidos, reintente" ,Toast.LENGTH_LONG).show();
                Intent loginIntent = new Intent(MainActivity.this,Login.class);
                startActivityForResult(loginIntent,LOGIN_INTENT_CODE);
            }

        }
    }
}
