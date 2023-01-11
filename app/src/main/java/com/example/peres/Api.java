package com.example.peres;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

  String BASE_URL = "http://10.0.2.2/peres/";

  @GET("api/user")
  Call<Propertie> getPoke(@Path("pokeId") int pokeId);


}