package com.spring.hazaremlak.dto;

import com.spring.hazaremlak.model.RealEstates;

public class CommentRatingDTO {

	private int user_id;
	private int realEstates_id;
	private String comments;
	private double ratings;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRealEstates_id() {
		return realEstates_id;
	}
	public void setRealEstates_id(int realEstates_id) {
		this.realEstates_id = realEstates_id;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	
	
}
