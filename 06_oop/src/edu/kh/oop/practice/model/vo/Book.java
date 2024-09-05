package edu.kh.oop.practice.model.vo;

public class Book {
	//필드
	private String title; //도서명
	private int price; //가격
	private double discountRate; //할인율
	private String author; //저자명
	
	//생성자
	public Book() {} //기본생성자단축키(ctrl+ space+ enter)
	
	//매개변수생성자 //단축키(alt +shift +s) Generate Constructor using Fields.. ->generate
	public Book(String title, int price, double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//메서드
	//단축키(alt +shift +s) getter/setter->generate

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//어노테이션:컴파일러용 주석
	//Overriding:재정의(메서드)
	
	@Override
	public String toString() {
		return title+"/"+price+"/"+discountRate+"/"+author;
	}
	
	
	
}
/*
현실 객체 : 자신의 속성값과 기능이 다른것들과 구분되어 식별이 가능한것
객체 지향 언어 : 현실세계(객체간의 상호작용)을 컴퓨터로 옮겨 만들어낸것
자바 객체 : new연산자를 통해 메모리영역에 생성된것
class : 객체의 특성(속성,기능)에 대한 정의를 한것
new 연산자 : 
추상화 : 불필요한것을 지우고 공통된것만 남기는 방법
캡슐화 : 직접적인 접근제한을 하고 간접적인 접근할수있게 메소드를 내부에 작성
캡슐화 원칙 :
	1.멤버변수에 대한 접근권한은 private
	2.연산처리 목적인 멤버메소드는 클래스내부에 작성
	3.멤버메소드는 클래스밖에서 접근할수있게 public
메서드/기능의 '정의'란 : 
	함수내에 작성된 연산 수행, 수행 후 반환값/ 결과
	값은 있거나 없을 수 있음
메서드의 '호출' 이란 :
return : 해당 메소드를 종료하고 자신을 호출한 메소드로 돌아가는 예약어
		(반환값이 있다면 그걸 가지고)

public String ex1() {
    return "Hi";
}

위 메서드 상세히 해석 : 변수public인 자료형string의 클래스ex1이 Hi를 반환한다
*/


