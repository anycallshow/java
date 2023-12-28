package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book book = new Book();
		Book book2 = new Book("자바의정석",30000,0.2,"남궁성");
		
		System.out.println(book.toString());
		System.out.println(book2.toString()); 
		System.out.println("=======================\n수정된 결과 확인");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println(book.toString());
		System.out.println("=======================");
		
		System.out.println("도서명 = " + book.getTitle());
		System.out.printf("할인된 가격 = %d원\n" , (int)(book.getPrice()*(1.0-book.getDiscountRate())));
		System.out.println("도서명 = " + book2.getTitle());
		System.out.printf("할인된 가격 = %d원\n", (int)(book2.getPrice()*(1.0-book2.getDiscountRate())));
		
		
		
	}
	
	
}
