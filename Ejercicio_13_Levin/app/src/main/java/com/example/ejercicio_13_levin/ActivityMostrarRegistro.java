package com.example.ejercicio_13_levin;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ejercicio_13_levin.configuracion.SQLiteConexion;
import com.example.ejercicio_13_levin.configuracion.Transacciones;
import com.example.ejercicio_13_levin.tablas.Personas;

import java.util.ArrayList;

public class ActivityMostrarRegistro extends AppCompatActivity {

    //Variables Globales
    SQLiteConexion conexion;
    ListView listaPersonas;
    ArrayList<Personas> lista;
    ArrayList <String> ArregloPersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_registro);

        conexion = new SQLiteConexion(this, Transacciones.NameDatabase, null, 1);
        listaPersonas=(ListView) findViewById(R.id.listapersonas);

        obtenerListaPersonas();
        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ArregloPersonas);
        listaPersonas.setAdapter(adp);

    }

    private void obtenerListaPersonas() {
        SQLiteDatabase db = conexion.getReadableDatabase();
        Personas listPersona=null;

        lista = new ArrayList<Personas>();

        //Cursor de la base de datos: nos apoya a recorrer la informacion de la tabla a la cual consultamos

        Cursor cursor= db.rawQuery("SELECT * FROM " + Transacciones.tablaPersonas, null);

        //Recorrer la informacion del cursor

        while(cursor.moveToNext()){
            listPersona=new Personas();
            listPersona.setId(cursor.getInt(0));
            listPersona.setNombres(cursor.getString(1));
            listPersona.setApellidos(cursor.getString(2));
            listPersona.setEdad(cursor.getInt(3));
            listPersona.setCorreo(cursor.getString(4));
            listPersona.setDireccion(cursor.getString(5));



            lista.add(listPersona);
        }

        cursor.close();

        fillList();

    }

    private void fillList() {

        ArregloPersonas =new ArrayList<>();
        for (int i = 0; i<lista.size(); i++){
            ArregloPersonas.add(lista.get(i).getId() + " | "
                    +lista.get(i).getNombres()+" | "
                    +lista.get(i).getApellidos()+ " | "
                    +lista.get(i).getEdad()+ " | "
                    +lista.get(i).getCorreo()+ " | "
                    +lista.get(i).getDireccion());

        }
    }
}