package com.example.user.examenmemento;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends ActionBarActivity {
    private RadioGroup rgpColores;
    private RadioButton rbtAzul;
    private RadioButton rbtRojo;
    private RadioButton rbtAmarillo;
    private RadioButton rbtVerde;
    private RadioButton rbtNegro;
    private Button btnGuardar;
    private Button btnRehacer;
    private Button btnDeshacer;
    private LinearLayout layPrincipal;
    private Lienzo lienzo;
    private Triangulo triangulo;
    private CareTaker careTaker;
    private int ultimo=0;
    private int actual=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgpColores=(RadioGroup)findViewById(R.id.rgpColores);
        rbtAmarillo=(RadioButton)findViewById(R.id.rbt_amarillo);
        rbtAzul=(RadioButton)findViewById(R.id.rbt_azul);
        rbtNegro=(RadioButton)findViewById(R.id.rbt_Negro);
        rbtRojo=(RadioButton)findViewById(R.id.rbt_rojo);
        rbtVerde=(RadioButton)findViewById(R.id.rbt_Verde);
        btnGuardar=(Button)findViewById(R.id.btn_guardar);
        btnRehacer=(Button)findViewById(R.id.btn_rehacer);
        btnDeshacer=(Button)findViewById(R.id.btn_deshacer);
        layPrincipal=(LinearLayout)findViewById(R.id.lay_principal);
        careTaker=  new CareTaker();
        triangulo =new Triangulo();
        lienzo= new Lienzo(this, triangulo);
        layPrincipal.addView(lienzo);
        btnDeshacer.setEnabled(false);
        btnRehacer.setEnabled(false);
        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch(rgpColores.getCheckedRadioButtonId()){
                    case R.id.rbt_amarillo:
                        setMemento(Color.YELLOW);
                        break;
                    case R.id.rbt_azul:
                        setMemento(Color.BLUE);
                        break;
                    case R.id.rbt_Negro:
                        setMemento(Color.BLACK);
                        break;
                    case R.id.rbt_rojo:
                        setMemento(Color.RED);
                        break;
                    case R.id.rbt_Verde:
                        setMemento(Color.GREEN);
                        break;
                    default:
                        break;

                }
                validaBoton();


            }
        });
        btnRehacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actual<ultimo)++actual;
                triangulo.restaurarMemento(careTaker.getMemento(actual));
                lienzo.setTriangulo(triangulo);
                lienzo.invalidate();
            }
        });
        btnDeshacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (actual>0)--actual;
                triangulo.restaurarMemento(careTaker.getMemento(actual));
                lienzo.setTriangulo(triangulo);
                lienzo.invalidate();
            }
        });

    }

    public void setMemento(int color){
        triangulo.setColor(color);
        lienzo.setTriangulo(triangulo);
        lienzo.invalidate();
        careTaker.addMemento(triangulo.guardarMeme());
        ultimo= careTaker.getMementos().size()-1;
        actual= ultimo;
    }
    private void validaBoton(){
        if (actual>0){
            btnDeshacer.setEnabled(true);
        }else{
            btnDeshacer.setEnabled(false);
        }
        if (ultimo>actual){
            btnRehacer.setEnabled(false);
        }else{
            btnRehacer.setEnabled(true);
        }
    }
}


