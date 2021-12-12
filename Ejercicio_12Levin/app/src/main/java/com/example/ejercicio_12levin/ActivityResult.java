package com.example.ejercicio_12levin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView result = (TextView)findViewById(R.id.resultado);
        String dato = getIntent().getStringExtra("Resultado");
        result.setText("" + dato);
    }
}