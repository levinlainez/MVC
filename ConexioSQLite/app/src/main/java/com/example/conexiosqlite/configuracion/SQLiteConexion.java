package com.example.conexiosqlite.configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteConexion extends SQLiteOpenHelper {

    //constructor de clase creacion de la base de datos sqlite

    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version )
    {
       super(context, dbname, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Creacion de la primera tabla base de datos
        db.execSQL(Transacciones.CreateTablePersonas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //eliminacion de las tablas al momento de eliminar la info de la db, DB limpia
        db.execSQL(Transacciones.DROPTablePersonas);
        onCreate(db);
    }
}
