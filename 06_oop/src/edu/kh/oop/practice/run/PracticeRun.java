package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;

public class PracticeRun {
	public static void main(String[] args) {

		BookService bs = new BookService();
		//클래스 안에 생성자가 하나도 없다면
		//컴파일러가 기본생성자는 자동으로 만들어줌
		//->그래서 우리가 BookService() 이렇게 사용 가능한것이다
		//->생성자가 하나라도 있으면 기본생성자 자동으로 생성 X
		//->매개변수생성자 만들었다면 기본생성자는 개발자가 만들어야함
		bs.practice();
	}
}
