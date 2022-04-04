package com.example.demo.modals;

public class CatalogItem {
	
	String userID;
	int movieID;
	String movieName;	
	String description;
	int rating;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public int getMovieID() {
		return movieID;
	}


	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public CatalogItem(String userID, int movieID, String movieName, String description, int rating) {
		this.userID = userID;
		this.movieID = movieID;
		this.movieName = movieName;
		this.description = description;
		this.rating = rating;
	}


	public CatalogItem() {
		
	}

}
