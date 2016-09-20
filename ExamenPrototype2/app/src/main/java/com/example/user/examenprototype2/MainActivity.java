package com.example.user.examenprototype2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private EditText edtRaza;
    private EditText edtHabitat;
    private EditText edtPeso;
    private Button btnClonar;
    private GridView grvLobo;
    private ArrayList<Lobo>lobos;
    private Lobo lobo;
    private LoboAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtRaza=(EditText)findViewById(R.id.edt_raza);
        edtHabitat=(EditText)findViewById(R.id.edt_habi);
        edtPeso=(EditText)findViewById(R.id.edt_peso);


        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvLobo=(GridView)findViewById(R.id.grv_lobos);


        lobos= new ArrayList<Lobo>();
        lobo=new Lobo();


        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lobo.setRaza(edtRaza.getText().toString());
                lobo.setHabitat(edtHabitat.getText().toString());
                lobo.setPeso(Float.parseFloat(edtPeso.getText().toString()));
                Lobo clon=(Lobo) lobo.clonar();
                lobos.add(clon);

                adapter= new LoboAdapter(MainActivity.this,(ArrayList<Lobo>)lobos);
                grvLobo.setAdapter(adapter);
            }
        });

    }


}
