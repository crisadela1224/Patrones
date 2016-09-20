package com.example.user.examensingleton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private EditText edtTipo;
    private EditText edtColor;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTipo=(EditText)findViewById(R.id.edt_tipo);
        edtColor=(EditText)findViewById(R.id.edt_color);

        btnCrear=(Button)findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Flor flor=Flor.getUnicaInstancia();
                flor.setTipo(edtTipo.getText().toString());
                flor.setColor(edtColor.getText().toString());
                Toast.makeText(MainActivity.this, "Se ingreso la flor: "+flor.getTipo()+"   "+flor.getColor(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
