package com.berkayuckan.movieapp.data.remote.dto


import com.berkayuckan.movieapp.domain.model.Movie
import com.google.gson.annotations.SerializedName

data class MoviesDTO(
    @SerializedName("Response")
    val response: String,
    @SerializedName("Search")
    val search: List<Search>,
    @SerializedName("totalResults")
    val totalResults: String
)

fun MoviesDTO.toMovieList(): List<Movie>{
    return search.map { search -> Movie(search.imdbID, search.poster, search.title, search.year) }
}
