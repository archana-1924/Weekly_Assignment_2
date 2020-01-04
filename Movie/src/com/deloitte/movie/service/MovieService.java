package com.deloitte.movie.service;

import com.deloitte.movie.model.Movie;

public interface MovieService {

 	boolean addMovie(Movie movie) throws Exception;
    Movie getMovieById(int userId) throws Exception;

}
