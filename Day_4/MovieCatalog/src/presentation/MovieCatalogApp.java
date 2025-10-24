package presentation;

import java.util.Scanner;

import domain.Movie;
import service.IMovieService;
import service.MovieFileService;

public class MovieCatalogApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Catalog Application!");
		boolean exit = false;
		Scanner console = new Scanner(System.in);
//		IMovieService movieService = new MovieServiceList();
		IMovieService movieService = new MovieFileService();
		
		while(!exit) {
			
			try {
				showMenu();
				exit = executeOption(console, movieService);
			}catch(Exception e) {
				System.out.println("An error occurred: " + e.getMessage());
			}
			System.out.println();
		}//end of while loop
		
	}
	
	private static void showMenu() {
		System.out.println("Menu:");
		System.out.println("1. Show Movie Catalog");
		System.out.println("2. Add Movie");
		System.out.println("3. Search Movie");
		System.out.println("4. Exit");
		System.out.print("Select an option: ");
	}
	
	private static boolean executeOption(Scanner console, IMovieService movieService) {
		int option = Integer.parseInt(console.nextLine());
		boolean exit = false;
		switch(option) {
		
			case 1->{
				System.out.println();
				movieService.movieCatalog();
			}
			case 2->{
				System.out.print("Enter movie title: ");
				String title = console.nextLine();
				movieService.addMovie(new Movie(title));
			}
			case 3->{
				System.out.print("Enter movie title to search: ");
				String title = console.nextLine();
				movieService.searchMovie(new Movie(title));
			}
			case 4->{
				System.out.println("Exiting the application. Goodbye!");
				exit = true;
				}
			default->{
				System.out.println("Invalid option. Please try again." + option);
			}
		
		}
		return exit;
	}

}
