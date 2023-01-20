package com.spring.hazaremlak.service;

import java.util.List;

import com.spring.hazaremlak.dto.CommentRatingDTO;
import com.spring.hazaremlak.model.CommentRating;

public interface CommentRatingService {
	CommentRating upload(CommentRatingDTO commentRatingDTO);
	List<CommentRating> getAllCommentRating();
	void  deleteComment(int id);
	List<CommentRating> getCommentRatingById(int id);
}
