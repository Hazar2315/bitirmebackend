package com.spring.hazaremlak.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hazaremlak.dto.CommentRatingDTO;
import com.spring.hazaremlak.model.CommentRating;
import com.spring.hazaremlak.service.CommentRatingService;

@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/rating")
public class CommentRatingController {

	private CommentRatingService commentRatingService;

	public CommentRatingController(CommentRatingService commentRatingService) {
		super();
		this.commentRatingService = commentRatingService;
	}
	
	@PostMapping("/uploadComment")
	public ResponseEntity<CommentRating> upload(@RequestBody CommentRatingDTO commentRatingDTO ){
			return new ResponseEntity<CommentRating>(commentRatingService.upload(commentRatingDTO),HttpStatus.CREATED);
	}
	@GetMapping("/getComment")
	public List<CommentRating> getAllCommentRating(){
		return commentRatingService.getAllCommentRating();
	}
	@GetMapping("/getCommentById/{id}")
	public List<CommentRating> getCommentRatingById(@PathVariable("id")int id){
		return commentRatingService.getCommentRatingById(id);
	}
	
	
	@DeleteMapping("/deleteComment/{id}")
	public ResponseEntity<String> deleteComment(@PathVariable("id")int id){
		commentRatingService.deleteComment(id);
		return new ResponseEntity<String>("User deleted successfuly!.",HttpStatus.OK);
		
	}
	

}
