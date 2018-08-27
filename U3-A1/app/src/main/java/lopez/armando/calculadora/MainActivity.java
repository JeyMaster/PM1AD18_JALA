package lopez.armando.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    double num1=0;
    String operacion="";
    int con=0,conM=0,conD=0,conI=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 =(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"1");
            }
        });

        Button btn2 =(Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"2");
            }
        });

        Button btn3 =(Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"3");
            }
        });

        Button btn4 =(Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"4");
            }
        });

        Button btn5 =(Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"5");
            }
        });

        Button btn6 =(Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"6");
            }
        });

        Button btn7 =(Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"7");
            }
        });

        Button btn8 =(Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"8");
            }
        });

        Button btn9 =(Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"9");
            }
        });

        Button btn0 =(Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if((txtPant.getText()+"").equals("NaN")|(txtPant.getText()+"").equals("Infinity")|conI==1){
                    txtPant.setText("");
                }
                conI=0;
                txtPant.setText(txtPant.getText()+"0");
            }
        });

        Button btnPun =(Button) findViewById(R.id.btnPun);
        btnPun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant = (TextView) findViewById(R.id.txtPant);
                if (con==0) {
                    txtPant.setText(txtPant.getText() + ".");
                    con++;
                }
            }
        });

        Button btnClear =(Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant = (TextView) findViewById(R.id.txtPant);
                    txtPant.setText("");
                    con=0;
                    num1=0;
                    conD=0;
                    conM=0;
                    conI=0;
            }
        });

        Button btnMas =(Button) findViewById(R.id.btnMas);
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                num1 += Double.parseDouble(txtPant.getText()+"");
                txtPant.setText("");
                operacion="+";
                con=0;
            }
        });

        Button btnMen =(Button) findViewById(R.id.btnMen);
        btnMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                num1 = Double.parseDouble(txtPant.getText()+"")-num1;
                txtPant.setText("");
                operacion="-";
                con=0;
            }
        });

        Button btnMul =(Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if(conM==0){
                    num1 = Double.parseDouble(txtPant.getText()+"")*1;
                    conM++;
                }else{
                    num1 *= Double.parseDouble(txtPant.getText()+"");
                }
                txtPant.setText("");
                operacion="*";
                con=0;
            }
        });

        Button btnDiv =(Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                if(conD==0){
                    num1 = Double.parseDouble(txtPant.getText()+"")*1;
                    conD++;
                }else{
                    num1 /= Double.parseDouble(txtPant.getText()+"");
                }
                txtPant.setText("");
                operacion="/";
                con=0;
            }
        });

        Button btnIgu =(Button) findViewById(R.id.btnIgu);
        btnIgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtPant=(TextView) findViewById(R.id.txtPant);
                switch (operacion){
                    case "+":
                        num1+=Double.parseDouble(txtPant.getText()+"");
                        break;
                    case "-":
                        num1-=Double.parseDouble(txtPant.getText()+"");
                        break;
                    case "*":
                        num1*=Double.parseDouble(txtPant.getText()+"");
                        break;
                    case "/":
                        num1/=Double.parseDouble(txtPant.getText()+"");
                        break;
                }
                conI=1;
                txtPant.setText(num1+"");
                num1=0;
                conM=0;
                conD=0;
            }
        });
    }
}
