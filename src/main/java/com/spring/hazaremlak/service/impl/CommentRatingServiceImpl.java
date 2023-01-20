package com.spring.hazaremlak.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.hazaremlak.dto.CommentRatingDTO;
import com.spring.hazaremlak.exception.ResourceNotFoundException;
import com.spring.hazaremlak.model.CommentRating;
import com.spring.hazaremlak.respository.CommentRatingRepository;
import com.spring.hazaremlak.respository.RealEstatesImageRepository;
import com.spring.hazaremlak.respository.RealEstatesRepository;
import com.spring.hazaremlak.respository.UserRepository;
import com.spring.hazaremlak.service.CommentRatingService;

@Service
public class CommentRatingServiceImpl implements CommentRatingService {
	private RealEstatesRepository realEstatesRepository;
	private UserRepository userRepository;
	private CommentRatingRepository commentRatingRepository;
	
	
	public CommentRatingServiceImpl(RealEstatesRepository realEstatesRepository,UserRepository userRepository,CommentRatingRepository commentRatingRepository) {
		super();
		this.realEstatesRepository = realEstatesRepository;
		this.userRepository=userRepository;
		this.commentRatingRepository=commentRatingRepository;
	}
	
	
	
	
	
	
	public CommentRating upload(CommentRatingDTO commentRatingDTO) {
		// TODO Auto-generated method stub
		CommentRating commentRating=new CommentRating();
		commentRating.setRealEstates(realEstatesRepository.findById(commentRatingDTO.getRealEstates_id()).get());
		commentRating.setUser(userRepository.findById(commentRatingDTO.getUser_id()).get());
		commentRating.setComments(commentRatingDTO.getComments());
		commentRating.setRatings(commentRatingDTO.getRatings());
		return commentRatingRepository.save(commentRating);
	}






	@Override
	public List<CommentRating> getAllCommentRating() {
		// TODO Auto-generated method stub
		return commentRatingRepository.findAll();
	}






	@Override
	public void deleteComment(int id) {
		
		commentRatingRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("CommentRating","Id",id));
		commentRatingRepository.deleteById(id);
	}






	@Override
	public List<CommentRating> getCommentRatingById(int id) {
		// TODO Auto-generated method stub
		return  commentRatingRepository.findAllByRealId(id);
	}





















}
