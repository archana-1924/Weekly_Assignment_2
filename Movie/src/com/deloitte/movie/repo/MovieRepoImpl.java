package com.deloitte.movie.repo;

import java.util.ArrayList;
import java.util.List;

import com.deloitte.movie.model.Movie;

public class MovieRepoImpl implements MovieRepo {

	 List<Movie> movies= new ArrayList<>();

	@Override
	public boolean addMovie(Movie movie) throws Exception {
	     movies.add(movie);
	     if(movies.size()!=0)
		  return true;
	     else
	    	 return false;
	}

	@Override
	public Movie getMovieById(int userId) throws Exception {
		
		for(Movie m1:movies)
		{
		if(userId== m1.getId()) {
		
			return m1;
		}
	}
	return null;
}
}
