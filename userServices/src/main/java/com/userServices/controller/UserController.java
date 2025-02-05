package com.userServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userServices.entities.User;
import com.userServices.services.userService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	userService us;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody  User user){
	
		
		User user1 = us.saveUser(user);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	
	@GetMapping("/{userid}")
	public ResponseEntity<User> getSingleUser(@PathVariable  String userid){
	   User oneUser = us.singleUser(userid);
		
		return ResponseEntity.ok(oneUser);
	}
	
	
	@GetMapping
	public ResponseEntity<List<User>> getUser(){
		List<User> allUser = us.getAll();
		
		return ResponseEntity.ok(allUser);
	}
	
	

}
