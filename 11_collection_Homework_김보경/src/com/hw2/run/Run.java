package com.hw2.run;

import java.util.LinkedList;
import java.util.List;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		//Zoo 객체 생성
		//Tiger 객체 생성하여 zoo에 추가하기
		//Monkey 객체 생성하여 zoo에 추가하기

		
		//동물원 메뉴 출력하여 입력한 값 대로 코드 수행하기
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Tiger("호랑이"));
		zoo.addAnimal(new Monkey("원숭이"));
		zoo.displayMenu();
	}
}
