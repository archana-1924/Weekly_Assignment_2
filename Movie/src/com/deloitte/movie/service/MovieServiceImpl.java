package com.deloitte.movie.service;

import com.deloitte.movie.model.Movie;
import com.deloitte.movie.repo.MovieRepo;
import com.deloitte.movie.repo.MovieRepoImpl;

public class MovieServiceImpl implements MovieService {
	
	MovieRepo repo;
   public MovieServiceImpl() {
		
		repo= new MovieRepoImpl();
	}

   @Override
	public boolean addMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return repo.addMovie(movie);
	}

	@Override
	public Movie getMovieById(int userId) throws Exception {
		// TODO Auto-generated method stub
		return repo.getMovieById(userId);
	}

}
