package com.deloitte.movie.repo;

import com.deloitte.movie.model.Movie;

public interface MovieRepo {

	boolean addMovie(Movie movie) throws Exception;
	Movie getMovieById(int userId) throws Exception;
}
