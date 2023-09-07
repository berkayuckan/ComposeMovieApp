package com.berkayuckan.movieapp.data.repository

import com.berkayuckan.movieapp.data.remote.MovieAPI
import com.berkayuckan.movieapp.data.remote.dto.MovieDetailDto
import com.berkayuckan.movieapp.data.remote.dto.MoviesDTO
import com.berkayuckan.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI): MovieRepository{
    override suspend fun getMovies(search: String): MoviesDTO {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}