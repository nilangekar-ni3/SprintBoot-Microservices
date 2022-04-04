package com.example.demo.modals;

public class Rating {
	
	int movieId;
	int rating;
	String movieName;
	
	
	
	public Rating(int movieId, int rating, String movieName) {
		super();
		this.movieId = movieId;
		this.rating = rating;
		this.movieName = movieName;
	}



	public int getMovieId() {
		return movieId;
	}



	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public Rating() {
		
	}
	

}
