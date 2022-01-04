package com.iu.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	//접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선언]){}
	
	public Scanner test4() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	
	public String test3() { //리턴할게 있다면 public int test3() {아래에 return 0; 을 써줄것}
		//아직 확정이 안됐으면 void로 써줄것
		// 키보드로부터 이름을 입력받고 리턴
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		
		return name;
	}
	
	public int test2() { //리턴할 데이터의 데이터타입을 void 칸에 넣어줌
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("Test2 : " + num);
		return num;
	}

	//접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선언]){}

	public void test1() {
		System.out.println("void는 리턴이 없을 때 사용");

	}
}
