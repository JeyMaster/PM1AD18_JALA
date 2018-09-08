package lopez.armando.pasoparametros.activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import lopez.armando.pasoparametros.DAOS.UsuariosDao;
import lopez.armando.pasoparametros.Models.Usuario;
import lopez.armando.pasoparametros.R;

public class Login extends Activity {
    EditText txtUsuario, txtpass;
    Button btnBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUsuario = findViewById(R.id.TxtUsuario);
        txtpass = findViewById(R.id.TxtPassword);
        btnBoton =findViewById(R.id.btnLogin);

        btnBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UsuariosDao udao=new UsuariosDao();

                boolean resul= udao.usuarioExist(new Usuario(txtUsuario.getText().toString(),
                        txtpass.getText().toString()));
                Intent respuesta = new Intent();
                respuesta.putExtra("resultado", resul);
                setResult(MainActivity.LOGIN_INTENT_CODE,respuesta);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
