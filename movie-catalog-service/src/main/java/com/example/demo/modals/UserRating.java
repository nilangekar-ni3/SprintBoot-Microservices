package com.example.demo.modals;

import java.util.List;

public class UserRating {
	
	String userName;
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private List<Rating> userRatingList;

	public List<Rating> getUserRatingList() {
		return userRatingList;
	}

	public void setUserRatingList(List<Rating> userRatingList) {
		this.userRatingList = userRatingList;
	}

	
	
	public UserRating(String userName, List<Rating> userRatingList) {
		this.userName = userName;
		this.userRatingList = userRatingList;
	}

	public UserRating() {
		
	}
	

}
