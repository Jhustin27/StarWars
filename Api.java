package com.example.jhustin.starwars;

//Se importa la utilidad Lista
import java.util.List;


//Se importan los paquetes específicos del Retrofit
import retrofit2.Call;
import retrofit2.http.GET;



public interface Api {

    //Se declara el URL del servicio
    String BASE_URL = "https://swapi.co/api/";

    //Se declara la extensión de la cual obtendremos la lista de heroes (En este caso: simplifiedcoding.net/demos/**marvel**)
    @GET("people")
    Call<List<Hero>> getHeroes(); //Se hace el llamado de la lista y se invoca al método getHeroes
}