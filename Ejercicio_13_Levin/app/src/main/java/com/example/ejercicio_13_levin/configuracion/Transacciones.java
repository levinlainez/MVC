package com.example.ejercicio_13_levin.configuracion;

public class Transacciones {

    /*Nombre de la base de datos*/
    public static final String NameDatabase ="PM01DB";

    /* Tablas de la base de datos en SQLite*/

    public static final  String tablaPersonas= "personas";

    /*Campos de la tabla personas de la base de datos en SQLite*/

    public static final String id="id";
    public static final String nombres="nombres";
    public static final String apellidos="apellidos";
    public static final String edad="edad";
    public static final String correo="correo";
    public static final String direccion="direccion";

    /*Transacciones DDl tabla Personas ""  = * + -*/

    public static final String createTablePersonas ="CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombres TEXT, apellidos TEXT, edad INTEGER, correo TEXT, direccion TEXT)";

    public static final String DROPTablePersonas = "DROP TABLE EXISTS personas";

}
