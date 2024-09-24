package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapService {

	//Map : Key와 Value 한쌍이 데이터가 되어 이를 모아둔 객체
	
	//-Key를 모아두면 Set의 특징(중복 X)
	//-Value를 모아두면 List의 특징(중복 O)
	
	
	public void ex1() {
		
		//HashMap<K, V> : Map의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(Integer Key, String Value) :추가
		map.put(1, "홍박사");
		map.put(2, "가나다");
		map.put(3, "라마바");
		map.put(4, "사아자");
		map.put(5, "차카타");
		map.put(6, "파하");
		
		//key 중복 테스트
		map.put(1, "홍홍홍"); //중복 허용 X, 대신 Value 덮어쓰기
		
		//value 중복 테스트
		map.put(7, "파하");
		
		// {K=V, K=V...}
		System.out.println( map ); //map.toString() 오버라이딩 되어있음
	}
	
	
	public void ex2() {
	}
	
	
	public void ex3() {
		List< Map<String, Object> > list = new ArrayList< Map<String, Object> >();
		
		for(int i=0; i<10; i++) {
			//Map 생성
			Map<String, Object> map = new HashMap<String, Object>();
			
			//Map에 데이터 추가
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			
			//Map을 List에 추가
			list.add(map);
			
		}
		
		//for문 종료 시 list에 10개의 Map객체가 추가되어있다
		System.out.println(list);
		
		//향상된 for문 이용하여 key가 "id"에 대응되는 value값 전부 출력하기
		for( Map<String, Object> temp : list ) {
			System.out.println( temp.get("id") );
		}
		
	}
	
	
}
