package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{
	
	//필드
	private boolean hasPhysicalKeyboard; //물리적키보드유무
	
	//기본생성자
	public BasicPhone() {}
	//매개변수생성자
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price); //<-부모의매개변수
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	//메서드
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}
	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	public void checkKeyboard() {
		
		if(hasPhysicalKeyboard) { //물리적키보드가 존재한다면
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다");
		} else { //물리적키보드가 존재하지 않는다면
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다");
		}
		
	}
	
	
	

	
}
