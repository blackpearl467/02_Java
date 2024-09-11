package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone{
	
	//필드
	private String operatingSystem; //OS,운영체제
	private int storageCapacity; //스토리지공간크기,용량
	
	//기본생성자
	public SmartPhone() {}
	//매개변수생성자
	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price); //<-부모의매개변수
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	//메서드
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo(); //super는 부모객체phone을 의미 = 호출했다는것
		System.out.println("Operating System : " + operatingSystem);
		System.out.println("StorageCapacity : " + storageCapacity + "GB");
	}
	
}
