package com.example.conexiosqlite.tabla;

public class Personas {

    private Integer id;
    private String nombres;
    private String Apellidos;
    private Integer edad;
    private String correo;

    public Personas(Integer id, String nombres, String apellidos, Integer edad, String correo) {
        this.id = id;
        this.nombres = nombres;
        Apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

  
    
}
