package com.userServices.exception;

public class ResourceNotFoundException  extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(){
		super("Resource NotFound on server");
	}
	
	public ResourceNotFoundException(String msg){
		super(msg);
	}
	
}
