package com.deloitte.movie.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.deloitte.movie.model.Movie;
import com.deloitte.movie.service.MovieService;
import com.deloitte.movie.service.MovieServiceImpl;

public class MovieApplication {

	public static void main(String[] args) throws Exception, IOException {

		int userId, ch;
		String name, showDate, showTime, status;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		MovieService service = new MovieServiceImpl();

		try {
			while (true) {
				System.out.println("Enter your choice : \n1.Add movie and display movie detials by ID 2.Stop Adding");
				ch = Integer.parseInt(in.readLine());
				if (ch == 1) {
					System.out.println("Enter the User ID : ");
					userId = Integer.parseInt(in.readLine());
					System.out.println("Enter the name : ");
					name = in.readLine();
					System.out.println("Enter the show date in (DD-MM-YYYY) format : ");
					showDate = in.readLine();
					System.out.println("Enter the show time in (HH:MM) : ");
					showTime = in.readLine();
					System.out.println("Enter the status : ");
					status = in.readLine();
					Movie movie = new Movie(userId, name, showDate, showTime, status);

					if (service.addMovie(movie)) {
						System.out.println("Movie added");
					} else {
						System.out.println("Movie not added");
					}
				}
				if (ch == 2) {
					int inputId;
					System.out.println("Enter the ID for which details have to be printed : ");
					inputId = Integer.parseInt(in.readLine());
					Movie movie1 = new Movie();
					movie1 = service.getMovieById(inputId);
					System.out.println(movie1);

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}