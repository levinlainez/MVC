package com.example.ejercicio_13_levin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAgregar=(Button) findViewById(R.id.btnInsertar);
        Button btnMostrar=(Button) findViewById(R.id.btnMostrar);
        Button btnConsulta=(Button) findViewById(R.id.btnConsulta);

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityConsulta.class);
                startActivity(intent);

            }
        });


        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMostrarRegistro.class);
                startActivity(intent);

            }
        });

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityInsert.class);
                startActivity(intent);

            }
        });
    }
}