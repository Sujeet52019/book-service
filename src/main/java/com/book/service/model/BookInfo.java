package com.book.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookInfo {
	
	private int id;
	
	private String bookName;
	private String author;
	private String releaseDate;
	private int noOfPage;
	private int price;

}
