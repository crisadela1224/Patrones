package com.example.user.examenprototype;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private EditText edtRaza;
    private EditText edtColor;
    private EditText edtPeso;
    private Button btnClonar;
    private GridView grvGato;
    private ArrayList<Gato>gatos;
    private Gato gato;
    private GatoAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtRaza=(EditText)findViewById(R.id.edt_raza);
        edtColor=(EditText)findViewById(R.id.edt_color);
        edtPeso=(EditText)findViewById(R.id.edt_peso);


        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvGato=(GridView)findViewById(R.id.grv_gatos);


        gatos= new ArrayList<Gato>();
        gato=new Gato();


        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gato.setRaza(edtRaza.getText().toString());
                gato.setColor(edtColor.getText().toString());
                gato.setPeso(Float.parseFloat(edtPeso.getText().toString()));
                Gato clon=(Gato) gato.clonar();
                gatos.add(clon);

                adapter= new GatoAdapter(MainActivity.this,(ArrayList<Gato>)gatos);
                grvGato.setAdapter(adapter);
            }
        });

    }
}
