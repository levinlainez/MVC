package com.example.retrofitapp.Interfaces;

import com.example.retrofitapp.Models.Usuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface UsuariosApi {
    String Ruta= "/posts";
    String Ruta1="posts/{valor}";
    @GET(Ruta)
    Call<List<Usuarios>> getUsuarios();

    @GET(Ruta1)
    Call<Usuarios> getUsuarios(@Path("valor") String valor);


}
