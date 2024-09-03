package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	
	public void practice1(){
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[9];
	System.out.println(arr.length);
	System.out.println("짝수 번째 인덱스 합 : " +  );
	}
	
	
	public void practice3() {
	Scanner sc = new Scanner(System.in);
	
	int []arr =new int[input];
	//i->0 1 2 3 4
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0; i<arr.length; i++) {
			// 0 1 2 3 4
		System.out.println("양의 정수 : "+ input);
		System.out.println(i+1);
	}
	
	
	public void practice4() {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[5];
	int input = sc.nextInt();
	
	}
	
	
	public void practice5() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열 : ");
	String input = sc.nextLine();
	
	char[] arr=new char[input.length()];
	for(int i=0; i<arr.length; i++) {
		arr[i] = input.charAt(i);
	}
	System.out.print("문자 : ");
	char ch = sc.next().charAt(0);
	
	System.out.println("");
	}
	
	
	public void practice6(){
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[5];
	int input = sc.nextInt();
	
	System.out.println("정수 : ");
	for(int i=0; i <arr.length; i++) //0 1 2 3 4
			System.out.println("배열" + i +"번째 인덱스에 넣을 값 : ");
		
	int sum=0;//합계저장용변수
	System.out.println(Arrays.toString(arr));
	System.out.println("총합 : "+ sum);
}
	
	
	public void practice9(){
	Scanner sc = new Scanner(System.in);
	
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0; i < arr.length; i++) {
	int random = (int)(Math.random() * 10 + 1);
	arr[i] = random;
	}
	System.out.println("발생한 난수 : " + (Arrays.toString(arr)));
	}
	
	
	public void practice10(){
	Scanner sc = new Scanner(System.in);
		
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0; i < arr.length; i++) {
	int random = (int)(Math.random() * 10 + 1);
	arr[i] = random;
	}
	int max = arr[0];
	int min = arr[0];
	
	for(int i = 0; i < arr.length; i++) {
	//최고점 비교
	if(arr[i]>max) {
		max = arr[i];
	}
	//최저점 비교
	if(arr[i]<max) {
		min = arr[i];
	}
	}
	//System.out.println("발생한 난수 : " + arr);
	System.out.println("발생한 난수 : " + (Arrays.toString(arr)));
	System.out.println("최대값 : " + max);
	System.out.println("최소값 : " + min);
	}	
		
	
	public void practice11() {
	Scanner sc = new Scanner(System.in);
		
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0; i < arr.length; i++) {
	int random = (int)(Math.random() * 10 + 1);
	arr[i] = random;
	}	
	for(int x=0; x<i; x++);{
		if(random == arr[x]) {
		i--;
			
			break;
		}
	}
	
	} 
	System.out.println(Arrays.toString(arr));
		
}
