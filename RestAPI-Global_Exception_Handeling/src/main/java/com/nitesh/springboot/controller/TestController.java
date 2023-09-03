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
public class TestController {

	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping(value = "greet")
	public ResponseEntity<String> getGreet() throws Exception{
		
		String msg;
		
		return new ResponseEntity<String>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
