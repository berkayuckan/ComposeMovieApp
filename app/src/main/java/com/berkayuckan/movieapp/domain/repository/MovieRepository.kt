package com.berkayuckan.movieapp.domain.repository

import com.berkayuckan.movieapp.data.remote.dto.MovieDetailDto
import com.berkayuckan.movieapp.data.remote.dto.MoviesDTO

interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDTO
    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto


}