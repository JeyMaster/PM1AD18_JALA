package lopez.armando.fragments;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFragmentoA = (Button)  findViewById(R.id.btnFragmentoA);
        btnFragmentoA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //getFragmentManager()
                getSupportFragmentManager()
                        .beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                        .replace(R.id.contenedor, new FragmentA())
                        .commit();

            }


        });

        Button btnFragmentoB = (Button)  findViewById(R.id.btnFragmentoB);
        btnFragmentoB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //getFragmentManager()
                getSupportFragmentManager()
                        .beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .replace(R.id.contenedor, new FragmentB())
                        .commit();

            }


        });

    }
}
