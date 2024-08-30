package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {//예제성 클래스
	
	Scanner sc= new Scanner(System.in);
	
	public void practice1() {
		System.out.print("숫자를 한 개 입력하세요");
		int number = sc.nextInt();
		
		String result;//결과로 출력할것이 문장
		
		if(number <= 0) {
			result = "양수를 입력해주세요";
		} else if(number % 2 ==0) {
			result = "양수입니다";
		} else {
			result= "홀수입니다";
		}
		
		System.out.println(result);
		
	}
	public void practice2() {
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("수학점수 : ");
		int mat = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;//합계
		double avg = sum / 3.0;//평균
		
		if() {//합격
			
		}else {//불합격
			
		}
		

		
		
	}
	
	public void practice3() {
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		default: System.out.println(month + "월은 잘못 입력된 달입니다");
		}
	}
	
	public void practice4() {

	}
	
	public void practice5() {

	}
	
}