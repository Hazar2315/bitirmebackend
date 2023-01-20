package com.spring.hazaremlak.service;


import com.spring.hazaremlak.model.User;
import com.spring.hazaremlak.model.UserFilter;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {
	User saveUser(User user);
	//UserDto saveUser(UserDto userDto);
	List<User>  getAllUsers();
	List<User> getAllByFilter(UserFilter filter);
	Page<User> getPageByFilter(UserFilter filter,Pageable pageable);
	User getUserById(int id);
	User updateUser(User user,int id);
	void deleteUser(int id);
	User login(User user);
	//Page<User> getRequestFilters(int page,int limit,String userName);

}
