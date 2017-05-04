package com.example.oigarcia.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView res;
    String pantalla;
    String s;
    float num1, num2, resul;
    int oper = 0 , numerico =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = (TextView) findViewById(R.id.textView2);
        View boton1=findViewById(R.id.b1);
        boton1.setOnClickListener((View.OnClickListener) this);

        View boton2=findViewById(R.id.b2);
        boton2.setOnClickListener((View.OnClickListener) this);



    }





    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.b0) {
            Agregar("0");
        }

        if (v.getId() == R.id.b1) {
            Agregar("1");
        }
        if (v.getId() == R.id.b2) {
            Agregar("2");
        }

        if (v.getId() == R.id.b3) {
            Agregar("3");
        }
        if (v.getId() == R.id.b4) {
            Agregar("4");
        }
        if (v.getId() == R.id.b5) {
            Agregar("5");
        }

        if (v.getId() == R.id.b6) {
            Agregar("6");
        }
        if (v.getId() == R.id.b7) {
            Agregar("7");
        }
        if (v.getId() == R.id.b8) {
            Agregar("8");
        }

        if (v.getId() == R.id.b9) {
            Agregar("9");
        }
        if (v.getId() == R.id.bpunto) {
            Agregar(".");
        }

        if (v.getId() == R.id.bmas) {
            operacion("+");
        }

        if (v.getId() == R.id.bmenos) {
            operacion("-");
        }

        if (v.getId() == R.id.bpor) {
            operacion("*");
        }

        if (v.getId() == R.id.bdiv) {
            operacion("/");
        }

        if (v.getId() == R.id.bigual) {
            operacion("=");
        }

        if(v.getId()==R.id.bc){
            res.setText("");
            num1 = 0;
            num2=0;
            oper=0;
            numerico=0;
        }

        if(v.getId()==R.id.bce){
            res.setText("");
        }

    }

    public void Agregar(String val) {
           if(oper > 1) {
               res.setText("");
               oper =1;
             }

        pantalla = res.getText() + val;
        numerico = 1;
        res.setText(pantalla);
        }

        public void operacion (String signo){
              if(numerico==0){

              }else {
                 if(oper==0) {
                     num1 = Float.valueOf(pantalla);
                     res.setText("");
                     s = signo;
                     oper ++;
                 }else{
                     num2 = Float.valueOf(pantalla);
                     pantalla = String.valueOf(operar(s,num1,num2));
                     res.setText(pantalla);
                     num1 = resul;
                     s=signo;
                     oper++;
                 }
              }
        }

        public float operar (String signo,float n1, float n2){

            if(signo=="+"){
              resul = n1+n2;
            }

            if(signo=="-"){
                resul = n1-n2;
            }

            if(signo=="*"){
                resul = n1*n2;
            }

            if(signo=="/"){
                resul = n1/n2;
            }

            return resul;

        }




    }


