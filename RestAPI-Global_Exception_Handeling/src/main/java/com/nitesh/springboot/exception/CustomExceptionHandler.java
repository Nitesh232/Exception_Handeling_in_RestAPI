package com.nitesh.springboot.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nitesh.springboot.binding.ExceptionInfo;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExceptionInfo> handleNPE(Exception npe){
		
		ExceptionInfo exInfo = new ExceptionInfo(npe.getMessage(), "NIT0008");
		logger.error("Null Pointer Exception Occurred!! :: "+npe.getMessage());
		
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae){
		
		ExceptionInfo exInfo = new ExceptionInfo(ae.getMessage(), "NIT0007");
		
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNDFE(NoDataFoundException ndfe){
		
		ExceptionInfo exInfo = new ExceptionInfo(ndfe.getMessage(), "NIT0009");
		
		logger.error("NoDataFound Exception Occurred!! :: "+ndfe.getMessage());
		
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.BAD_REQUEST);
	}

}
