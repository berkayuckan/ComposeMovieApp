package com.berkayuckan.movieapp.domain.use_case.get_movie_detail

import com.berkayuckan.movieapp.data.remote.dto.toMovieDetail
import com.berkayuckan.movieapp.data.remote.dto.toMovieList
import com.berkayuckan.movieapp.domain.model.Movie
import com.berkayuckan.movieapp.domain.model.MovieDetail
import com.berkayuckan.movieapp.domain.repository.MovieRepository
import com.berkayuckan.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMovieDetailsUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovieDetails(imdbId : String) : Flow<Resource<MovieDetail>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))
        }catch (e: IOError){
            emit(Resource.Error("No internet connection"))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "Error"))
        }
    }
}