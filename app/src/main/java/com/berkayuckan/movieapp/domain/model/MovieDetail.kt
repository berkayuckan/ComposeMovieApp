package com.berkayuckan.movieapp.domain.model

import com.berkayuckan.movieapp.data.remote.dto.Rating

data class MovieDetail(
    val actors: String,
    val awards: String,
    val country: String,
    val director: String,
    val genre: String,
    val imdbRating: String,
    val language: String,
    val plot: String,
    val poster: String,
    val rated: String,
    val released: String,
    val runtime: String,
    val title: String,
    val type: String,
    val year: String
)
