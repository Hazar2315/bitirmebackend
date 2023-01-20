package com.spring.hazaremlak.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment_rating")
public class CommentRating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cr_id")
	private int id;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="ratings")
	private double ratings;
	
	@ManyToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="real_estates_id")
	private RealEstates realEstates;
	
	@ManyToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="user_id")
	private User user;

	public CommentRating() {
		super();
	}

	public String getComments() {
		return comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public RealEstates getRealEstates() {
		return realEstates;
	}

	public void setRealEstates(RealEstates realEstates) {
		this.realEstates = realEstates;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CommentRating(String comments, double ratings, RealEstates realEstates, User user) {
		super();
		this.comments = comments;
		this.ratings = ratings;
		this.realEstates = realEstates;
		this.user = user;
	}
	
	
}
