package lopez.armando.flexiblefragments;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    InicioFragment fragmentInicio;
    SemanalFragment fragmentSemanal;
    MensualFragment fragmentMensual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio= new InicioFragment();
        fragmentMensual= new MensualFragment();
        fragmentSemanal = new SemanalFragment();

        BottomNavigationView toolbarPrincipal
                = findViewById(R.id.toolbarPrincipal);
        ListView menu=findViewById(R.id.lista_Items);
        if(toolbarPrincipal==null){
            menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position){
                        case 0:
                            //TODO:Cambiar a fragment Inicio
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.contenedorPrincipal, fragmentInicio)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();
                            break;
                        case 1:
                            //TODO:Cambiar a fragment Mensual
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.contenedorPrincipal, fragmentMensual)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();
                            break;
                        case 2:
                            //TODO:Cambiar a fragment Semanal
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.contenedorPrincipal, fragmentSemanal)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();
                            break;
                    }
                }
            });
        }else {
            toolbarPrincipal.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.actionInicio:
                                    //TODO:Cambiar a fragment Inicio
                                    getSupportFragmentManager()
                                            .beginTransaction()
                                            .replace(R.id.contenedorPrincipal, fragmentInicio)
                                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                            .addToBackStack(null)
                                            .commit();
                                    break;
                                case R.id.actionMensual:
                                    //TODO:Cambiar a fragment Mensual
                                    getSupportFragmentManager()
                                            .beginTransaction()
                                            .replace(R.id.contenedorPrincipal, fragmentMensual)
                                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                            .addToBackStack(null)
                                            .commit();
                                    break;
                                case R.id.actionSemanal:
                                    //TODO:Cambiar a fragment Semanal
                                    getSupportFragmentManager()
                                            .beginTransaction()
                                            .replace(R.id.contenedorPrincipal, fragmentSemanal)
                                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                            .addToBackStack(null)
                                            .commit();
                                    break;

                            }

                            return false;
                        }
                    }
            );
        }

    }
}