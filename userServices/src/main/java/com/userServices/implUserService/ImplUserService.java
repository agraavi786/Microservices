package com.userServices.implUserService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.userServices.entities.User;
import com.userServices.exception.ResourceNotFoundException;
import com.userServices.repositories.userRepository;
import com.userServices.services.userService;


@Service
public class ImplUserService implements userService{
	
    @Autowired
	userRepository up;
    
	public User saveUser(User user) {
		String randomuserid = UUID.randomUUID().toString();
		user.setUserId(randomuserid);
		
		return up.save(user);
	}

	
	public List<User> getAll() {
		
		
		return up.findAll();
	}

	
	public User singleUser(String uid) {
		return up.findById(uid).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server !!" + uid));
	}

}
