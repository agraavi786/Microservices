package com.userServices.services;

import java.util.List;

import com.userServices.entities.User;

public interface userService {
	
	User saveUser(User user);
	
	List<User> getAll();
	
	User singleUser(String uid);

}
