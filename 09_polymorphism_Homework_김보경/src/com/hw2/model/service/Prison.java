package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners; // 전체 수용자 저장용 배열 
	private int prisonerCount; //수용자수
	
	public Prison(int size) {
		
	}

	@Override
	public void addPerson(Person person) {}

	@Override
	public void removePerson(String id) {}

	@Override
	public void displayAllPersons() {}
}
