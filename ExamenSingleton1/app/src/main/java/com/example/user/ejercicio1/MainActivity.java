package com.example.user.ejercicio1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
     private EditText edtNombre;
    private Button btnCrear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        btnCrear=(Button)findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ciudad ciudad=Ciudad.getUnicaInstancia();
                ciudad.setNombre(edtNombre.getText().toString());
                Toast.makeText(MainActivity.this, "Se ingreso la Ciudad: "+ciudad.getNombre(),Toast.LENGTH_LONG).show();
            }
        });
    }



}
