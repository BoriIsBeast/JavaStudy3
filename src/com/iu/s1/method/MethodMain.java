package com.iu.s1.method;//JavaStudy3

import java.util.Random;
import java.util.Scanner;

public class MethodMain {
	
	public static void main(String[] args) {
	
		
		
		
		Random random = new Random();
		
		//객체 생성 코드
		//new
		ReturnStudy rs = new ReturnStudy();
		
		
		System.out.println("MainMethod Start");

		System.out.println("Conflict Test");
		

		System.out.println("GitHub Test");

		//참조변수명.멤버들
		rs.test1();
		
		int num = rs.test2(); //ReturnStudy의 값이 오는거기 때문에 int num <- 꼭 똑같지않아도 됨
		
		System.out.println("Main :" + num);
		
		String name = rs.test3();
		System.out.println(name);
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		
		System.out.println("MainMethod Finish");
		
	}

}
