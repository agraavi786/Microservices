package com.userServices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.userServices.payload.ApiResponse;

@RestControllerAdvice
public class GlobleExcpetion {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handerResourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		return new ResponseEntity<ApiResponse>(HttpStatus.NOT_FOUND);
		
		
		
		
	
		
		
		
		
	}

}
