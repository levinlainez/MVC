package com.example.ejercicio_12levin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityRegistro extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        EditText nombreE = (EditText)findViewById(R.id.nombre);
        EditText apellidoE = (EditText)findViewById(R.id.apellido);
        EditText edadE = (EditText)findViewById(R.id.edad);
        EditText correoE = (EditText)findViewById(R.id.correo);
        Button btnSalvar = (Button)findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Dato = "Nombre: " + nombreE.getText().toString() + "\n" + "Apellido: " + apellidoE.getText().toString()
                        + "\n" + "Edad: " + edadE.getText().toString() + "\n" + "Email: " + correoE.getText().toString();

                Intent pantalla = new Intent(getApplicationContext(), ActivityResult.class);
                pantalla.putExtra("Resultado", Dato);
                startActivity(new Intent(pantalla));
            }
        });
    }
}