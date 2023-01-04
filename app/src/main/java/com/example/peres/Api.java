package com.example.peres;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

  String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

  @GET("{pokeId}")
  Call<Propertie> getPoke(@Path("pokeId") int pokeId);

}