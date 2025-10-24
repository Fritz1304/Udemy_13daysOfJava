package service;

import java.util.ArrayList;
import java.util.List;

import domain.Movie;

public class MovieServiceList implements IMovieService {
	
	private final List<Movie> movies;
	
	public MovieServiceList() {
		this.movies = new ArrayList<>();
	}

	@Override
	public void movieCatalog() {
		
		System.out.println("Movie Catalog:");
		
		movies.forEach(System.out::println);
		
	}

	@Override
	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println("Movie added: " + movie);
	}

	@Override
	public void searchMovie(Movie movie) {
		//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
		int index = movies.indexOf(movie);
		if (index == -1) {
			System.out.println("Movie not found: " + movie);
			return;
		}
		System.out.println("novie found at index: " + index);
	}
	
//	public static void main(String[] args) {
//		
//		Movie movie1 = new Movie("Inception");
//		Movie movie2 = new Movie("The Matrix");
//		Movie movie3 = new Movie("Interstellar");
//		Movie movie4 = new Movie("The Godfather");
//		
//		IMovieService movieService = new MovieServiceList();
//		
//		movieService.addMovie(movie1);
//		movieService.addMovie(movie2);
//		movieService.addMovie(movie3);
//		movieService.addMovie(movie4);
//		
//		movieService.movieCatalog();
//		
//		
//		movieService.searchMovie(new Movie("Interstellar"));
//	}

}
