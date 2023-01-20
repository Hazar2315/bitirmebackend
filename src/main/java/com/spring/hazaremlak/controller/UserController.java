package com.spring.hazaremlak.controller;


import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hazaremlak.Handlers.ResponseHandler;
import com.spring.hazaremlak.dto.UserRegistrationDto;
import com.spring.hazaremlak.model.User;
import com.spring.hazaremlak.model.UserFilter;
import com.spring.hazaremlak.service.UserLoginResponse;
import com.spring.hazaremlak.service.UserService;

import java.util.List;
@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	

	
	//build create user rest api
	@PostMapping("/register")
	public ResponseEntity<User> saveUser(@RequestBody User user ){
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	}
	//Build Get All users Rest Api
	@GetMapping()
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserLoginResponse> Login(@RequestBody User user) {
		User responseObject = userService.login(user);
		UserLoginResponse loginResponse=new UserLoginResponse(responseObject.getId(),responseObject.getUserName(),responseObject.getSurName(),true,responseObject.getRole());
		return new ResponseEntity<UserLoginResponse>(loginResponse,HttpStatus.OK);
		
	}
	
	
	
	//Build get user by id in Rest Api
	//http://localhost:8060/api/users/1
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id")int userId){
		return new ResponseEntity<User>(userService.getUserById(userId),HttpStatus.OK);
	}
	//Build Update user Rest Api
	@PutMapping("{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id")int id,
	@RequestBody User user){
		return new ResponseEntity<User>(userService.updateUser(user, id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id")int id){
		//delete user from db
		userService.deleteUser(id);
		return new ResponseEntity<String>("User deleted successfuly!.",HttpStatus.OK);
	}
	@PostMapping("/search")
	public List<User> search(@RequestBody UserFilter filter){
		return userService.getAllByFilter(filter);
		
	}
	
	
}
