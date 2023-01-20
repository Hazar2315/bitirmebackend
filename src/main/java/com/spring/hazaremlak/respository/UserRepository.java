package com.spring.hazaremlak.respository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import com.spring.hazaremlak.model.User;


public interface UserRepository extends JpaRepository<User, Integer>,
JpaSpecificationExecutor<User>{

	  User findByEmailAndPassword(String email,String password);
	 // User findByUserName(String userName);
	//  Page<User> findByNameContainingIgnoreCase(String userName,Pageable pageable);
}
