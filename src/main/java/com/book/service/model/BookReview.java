package com.book.service.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BookReview {
	
	private int reviewId;
	
	private int infoId;
	
	private String reviewer;
	
	private String reviewComment;
	
	private int reviewPoint;

}
