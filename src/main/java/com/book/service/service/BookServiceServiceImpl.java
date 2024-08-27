package com.book.service.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.book.service.model.BookInfo;
import com.book.service.model.BookReview;
import com.book.service.model.BookService;

@Service
public class BookServiceServiceImpl implements BookServiceServiceI{

	@Autowired
	private RestTemplate restTemplate;

	private static final String BOOK_INFO = "http://localhost:8081/v1/book-info";
	private static final String BOOK_REVIEW = "http://localhost:8082/v1/book-review/info";
	
	@Override
	public BookService getBookServiceById(int infoId) {
		BookService bookService = new BookService(getBookInfo(infoId),
				getBookReviews(infoId));
		return bookService;
	}
	
	private BookInfo getBookInfo(int infoId) {
			RequestEntity request = RequestEntity
			     .get(URI.create(BOOK_INFO.concat("/"+infoId)))
			     .accept(MediaType.APPLICATION_JSON).build();
			 
			ResponseEntity<BookInfo> bookInfoResponse = restTemplate
								.exchange(request, BookInfo.class);
			 
		return bookInfoResponse.getBody();
	}
	
	private List<BookReview> getBookReviews(int infoId){
			 
		ResponseEntity<BookReview[]> responseEntity = restTemplate
					.getForEntity(URI.create(BOOK_REVIEW.concat("/"+infoId)), BookReview[].class);
		
		return Arrays.asList(responseEntity.getBody());
	}
	
}
