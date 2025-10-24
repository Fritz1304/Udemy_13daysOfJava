package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import domain.Movie;

public class MovieFileService implements IMovieService {
	
	private final String FILE_NAME = "movies.txt";
	
	public MovieFileService() {
		
		File file = new File (FILE_NAME);
		
		try {
			if(file.exists()) {
				System.out.println("The file " + FILE_NAME + " already exists.");
			}else {
				PrintWriter outputFile = new PrintWriter(new FileWriter(FILE_NAME));
				outputFile.close();
				System.out.println("The file " + FILE_NAME + " has been created successfully.");
			}
			
		}catch(Exception e) {
			System.out.println("An error occurred while creating the file: " + e.getMessage());
		}
		
	}

	@Override
	public void movieCatalog() {
		//Open the file and read the movies
		
		File file = new File(FILE_NAME);
		
		try {
			BufferedReader inputFile = new BufferedReader (new FileReader (file));

			//Read line by line
			
			String line;
			line = inputFile.readLine();
			//read all lines until the end of the file
			while(line != null) {
				Movie movie = new Movie (line);
				System.out.println(movie);
				line = inputFile.readLine();
			}
			inputFile.close();
		}catch(Exception e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
		
		
	}

	@Override
	public void addMovie(domain.Movie movie) {
		
		boolean append = false;
		
		File file = new File (FILE_NAME);
		
		try {
			append = file.exists();
			
			PrintWriter outputFile = new PrintWriter (new FileWriter (file, append));
			// Write the movie to the file
			
			outputFile.println(movie);
			
			outputFile.close();
			
			System.out.println("The movie has been added successfully." + movie);
		}catch(Exception e) {
			System.out.println("An error occurred while adding the movie: " + e.getMessage());
		}
			
	}

	@Override
	public void searchMovie(domain.Movie movie) {
		File file = new File (FILE_NAME);
		
		try {
			
			BufferedReader inputFile = new BufferedReader(new FileReader(file));
			String line;
			line = inputFile.readLine();
			int index = 1;
			boolean found = false;
			
			String movieTitle = movie.getTitle();
			while(line !=null) {
				if(movieTitle != null && movieTitle.equalsIgnoreCase(line)) {
					System.out.println("Movie found: " + line + " at index " + index);
					found = true;
					break;
				}else {
					line = inputFile.readLine();
					index++;
				}
			}
			if(found) {
				System.out.println("The movie " + movieTitle + " was found in the catalog in the index." + index);
			}else {
				System.out.println("The movie " + movieTitle + " was not found in the catalog.");
			}
			inputFile.close();
		}	catch(Exception e) {
				System.out.println("An error occurred while searching for the movie: " + e.getMessage());
			}
		}
}
