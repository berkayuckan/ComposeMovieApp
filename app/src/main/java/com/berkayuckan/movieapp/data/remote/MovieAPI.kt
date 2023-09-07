package com.berkayuckan.movieapp.data.remote

import com.berkayuckan.movieapp.data.remote.dto.MovieDetailDto
import com.berkayuckan.movieapp.data.remote.dto.MoviesDTO
import com.berkayuckan.movieapp.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    // https://www.omdbapi.com/?apikey=9bbe2090&s=batman
    // https://www.omdbapi.com/?apikey=9bbe2090&i=tt0372784

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString : String,
        @Query("apikey") apiKey : String = Constants.API_KEY
    ) : MoviesDTO

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey : String = Constants.API_KEY
    ) : MovieDetailDto
}