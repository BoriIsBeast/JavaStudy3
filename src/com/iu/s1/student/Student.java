package com.iu.s1.student;

public class Student {

	//Data 저장 용도
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	int total;
	
	double avg;
	
	public void makeTotal () {
		System.out.println("참조변수 this");
		System.out.println("참조변수 this : "+this);
	
		total = kor +eng +math;// this 생략가능
		avg = total/3.0;
		
		//this.hello(); 가능 hello();도 가능 
		}
	
	public void hello() {
		System.out.println("안녕하세요");
	
	}
}
