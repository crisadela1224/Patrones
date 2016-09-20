package com.example.user.examenmemento2;

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
    private Image img;
    private CareTaker careTaker;
    private int ultimo=0;
    private int actual=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgpColores=(RadioGroup)findViewById(R.id.rgp_colores);
        rbtAmarillo=(RadioButton)findViewById(R.id.rbt_amarillo);
        rbtAzul=(RadioButton)findViewById(R.id.rbt_azul);
        rbtNegro=(RadioButton)findViewById(R.id.rbt_negro);
        rbtRojo=(RadioButton)findViewById(R.id.rbt_rojo);
        rbtVerde=(RadioButton)findViewById(R.id.rbt_verde);
        btnGuardar=(Button)findViewById(R.id.btn_guardar);
        btnRehacer=(Button)findViewById(R.id.btn_rehacer);
        btnDeshacer=(Button)findViewById(R.id.btn_deshacer);
        layPrincipal=(LinearLayout)findViewById(R.id.lay_principal);
        careTaker=  new CareTaker();
        img =new Image();
        lienzo= new Lienzo(this, img);
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
                    case R.id.rbt_negro:
                        setMemento(Color.BLACK);
                        break;
                    case R.id.rbt_verde:
                        setMemento(Color.GREEN);
                        break;
                    case R.id.rbt_rojo:
                        setMemento(Color.RED);
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
                img.restaurarMemento(careTaker.getMemento(actual));

                lienzo.setImg(img);
                lienzo.invalidate();
            }
        });
        btnDeshacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (actual>0)--actual;
                img.restaurarMemento(careTaker.getMemento(actual));
                lienzo.setImg(img);
                lienzo.invalidate();
            }
        });

    }

    public void setMemento(int color){
        img.setColor(color);

        lienzo.setImg(img);
        lienzo.invalidate();
        careTaker.addMemento(img.guardarMeme());
        ultimo= careTaker.getMementos().size()-1;
        actual= ultimo;
    }
    private void validaBoton() {
        if (actual > 0) {
            btnDeshacer.setEnabled(true);
        } else {
            btnDeshacer.setEnabled(false);
        }
        if (ultimo > actual) {
            btnRehacer.setEnabled(false);
        } else {
            btnRehacer.setEnabled(true);
        }
    }
}
