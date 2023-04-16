package com.devoir.pokedex.pokedex.api;

import com.devoir.pokedex.pokedex.callback.PokemonCallBack;
import com.devoir.pokedex.pokedex.entities.PokemonInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokedexApiService {

    @GET("pokemon")
    Call<PokemonCallBack> getListaPokemons(@Query("limit") int limit, @Query("offset") int offset);

    @GET("pokemon/{url}")
    Call<PokemonInfo> getInfoPokemon(@Path("url") int url);
}