package com.example.conexiosqlite.configuracion;

public class Transacciones {

    //nombres de la base de datos

    public  static  final String NameDataBase ="PM01DB";


    //Tablas de la base de datos SQLite

    public static final String tablaPersonas = "personas";

    //Campos de la tabla personas de la base de datos SQLite
     public static final String id="id";
     public static final String nombres="nombres";
     public static final String Apellidos="Apellidos";
     public static final String edad="edad";
     public static final String correo="correo";

     //Transacciones DDL (data definition Lenguaje) tabla personas

    public static final  String CreateTablePersonas="CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombres TEXT, Apellidos TEXT, edad INTEGER, correo TEXT)";

    public static final String DROPTablePersonas= "DROP TABLE IF EXIST personas";



}
