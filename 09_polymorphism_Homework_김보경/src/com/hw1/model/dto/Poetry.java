package com.hw1.model.dto;

public class Poetry extends Book{
	
	//필드
	private int numberOfPoems; //시 수
	
	//생성자
	public Poetry() {}
	
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	//메서드
	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	

	@Override
	public void displayInfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %d",
						super.getTitle(), super.getAuthor(), numberOfPoems);
	}
}
