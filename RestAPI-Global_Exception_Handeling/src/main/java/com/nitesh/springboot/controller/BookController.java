package com.nitesh.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nitesh.springboot.exception.NoDataFoundException;

@RestController
public class BookController {
	
	@GetMapping("book/{isbn}")
	public String getBook(@PathVariable String isbn) {
		
		String msg = "";
		
		if(isbn.equals("ISBN007")) {
			msg = "Book is available in Store!";
		}else {
			throw new NoDataFoundException("Invalid ISBN Number!");
		}
		
		return msg;
	}

}
