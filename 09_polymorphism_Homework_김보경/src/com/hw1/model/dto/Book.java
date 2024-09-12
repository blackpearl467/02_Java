package com.hw1.model.dto;

public abstract class Book {
	//필드
	private String title; //제목
	private String author; //저자
	
	//생성자
	public Book() {}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	//메서드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract void displayInfo();
	
	
}
