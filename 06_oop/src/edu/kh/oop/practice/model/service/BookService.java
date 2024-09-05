package edu.kh.oop.practice.model.service;

import edu.kh.oop.cls.model.vo.User;
import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	public void ex1() {
		
		
		Book u1=new Book();
		System.out.println(u1.getTitle());
		System.out.println(u1.getPrice());
		System.out.println(u1.getDiscountRate());
		System.out.println(u1.getAuthor());
		
		Book u2=new Book("C언어", 30000, 0.1, "홍길동");
		
		System.out.printf("u1 : %s / %d / %d / %s\n");
		
		
		
		
		
	}
}
