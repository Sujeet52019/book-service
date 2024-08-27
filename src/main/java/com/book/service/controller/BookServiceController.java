package com.book.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.service.model.BookService;
import com.book.service.service.BookServiceServiceI;

@RestController
@RequestMapping("/v1")
public class BookServiceController {
	
	@Autowired
	private BookServiceServiceI bookServiceService;
	
	@GetMapping("/book-service/getBookDetailById/{book-info}")
	public ResponseEntity<BookService> getBookServiceById(@PathVariable("book-info") int infoId){
		System.out.println("Hello Controller "+ infoId);
		return new ResponseEntity<BookService> (bookServiceService.getBookServiceById(infoId), HttpStatus.OK);
		
	}

}
