package service;

import domain.Movie;

public interface IMovieService {
	
	public void movieCatalog();
	
	public void addMovie(Movie movie);
	
	public void searchMovie(Movie movie);

}
