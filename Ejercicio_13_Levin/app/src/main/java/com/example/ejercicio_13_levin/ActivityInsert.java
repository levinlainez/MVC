package com.example.ejercicio_13_levin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercicio_13_levin.configuracion.SQLiteConexion;
import com.example.ejercicio_13_levin.configuracion.Transacciones;

public class ActivityInsert extends AppCompatActivity {
    EditText nombres, apellidos, edad, correo, direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        nombres=(EditText) findViewById(R.id.nombre);
        apellidos=(EditText) findViewById(R.id.apellido);
        edad=(EditText) findViewById(R.id.edad);
        correo=(EditText) findViewById(R.id.correo);
        direccion=(EditText) findViewById(R.id.direccion);


        Button btnIngresar=(Button) findViewById(R.id.btnSalvar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgregarPersonas();
            }
        });
    }

    private void AgregarPersonas() {
        SQLiteConexion conexion= new SQLiteConexion(this, Transacciones.NameDatabase, null, 1);
        SQLiteDatabase db= conexion.getWritableDatabase();

        ContentValues valores =new ContentValues();
        valores.put(Transacciones.nombres, nombres.getText().toString());
        valores.put(Transacciones.apellidos, apellidos.getText().toString());
        valores.put(Transacciones.edad, edad.getText().toString());
        valores.put(Transacciones.correo, correo.getText().toString());
        valores.put(Transacciones.direccion, direccion.getText().toString());

        Long resultado= db.insert(Transacciones.tablaPersonas, Transacciones.id, valores);

        Toast.makeText(getApplicationContext(),"Registro ingresado : codigo : "+ resultado.toString(),Toast.LENGTH_LONG).show();

        db.close();

        limpiarPantalla();
    }

    private void limpiarPantalla() {
        nombres.setText("");
        apellidos.setText("");
        edad.setText("");
        correo.setText("");
        direccion.setText("");
    }
}