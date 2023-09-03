package com.nitesh.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitesh.springboot.binding.ExceptionInfo;

@RestController
public class UserController {
	
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping(value = "msg")
	public ResponseEntity<String> getMessage(){
		
		String msg = "Hello there! No Exception occurred!!";
		
		try {
			int x = 10/0;
		}catch(Exception e) {
			logger.error("Exception Occurred :: "+e.getMessage());
			throw new ArithmeticException(e.getMessage());
		}
	
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	
	

}
