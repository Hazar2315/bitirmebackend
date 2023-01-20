package com.spring.hazaremlak.service.impl;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.spring.hazaremlak.Filter.RealEstatesSpecificationGenerator;
import com.spring.hazaremlak.Filter.UserSpecificationGenerator;
import com.spring.hazaremlak.exception.ResourceNotFoundException;
import com.spring.hazaremlak.model.RealEstates;
import com.spring.hazaremlak.model.RealEstatesFilter;
import com.spring.hazaremlak.model.User;
import com.spring.hazaremlak.model.UserFilter;
import com.spring.hazaremlak.respository.CommentRatingRepository;
import com.spring.hazaremlak.respository.UserRepository;
import com.spring.hazaremlak.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private CommentRatingRepository commentRatingRepository;
	
	 
	public UserServiceImpl(UserRepository userRepository, CommentRatingRepository commentRatingRepository) {
		super();
		this.userRepository = userRepository;
		this.commentRatingRepository=commentRatingRepository;
	}
	public User saveUser(User user) {	
		return userRepository.save(user);
	}
	@Override
	public User login(User user) {
		return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}

	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("User","Id",id));
	}
	@Override
	public User updateUser(User user,int id) {
		User existingUser = userRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("User","Id",id));
		
		existingUser.setUserName(user.getUserName());
		existingUser.setSurName(user.getSurName());
		existingUser.setPassword(user.getPassword());
		existingUser.setEmail(user.getEmail());
		
		userRepository.save(existingUser);
		return existingUser;
	}
	@Override
	public void deleteUser(int id) {
		
		userRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("User","Id",id));
		userRepository.deleteById(id);
	}
	public List<User> getAllByFilter(UserFilter filter){
		return userRepository.findAll(UserSpecificationGenerator.filter(filter));
	}
	public Page<User> getPageByFilter(UserFilter filter,Pageable pageable){
		return userRepository.findAll(UserSpecificationGenerator.filter(filter),pageable);
	}
	













}
