package com.iu.s1.student;

import java.util.Scanner;

import com.iu.s1.student.Student;

public class StudentUtil {
	Scanner sc = new Scanner(System.in);
	
	public Student [] makeStudents() {
		//학생의 수를 입력받음
		//키보드로 부터 이름, 번호, 국어,영어,수학 입력 리턴
		//학생들의 정보를 리턴
		System.out.println("학생의 수를 입력하세요");
		int count = sc.nextInt();
		
		Student [] students = new Student[count];
		
		for(int i = 0;i<students.length;i++) {
			Student student = new Student();
			
			
			
			System.out.println("이름을 입력하세요");
			student.name = sc.next();
			System.out.println("번호을 입력하세요");
			student.num = sc.nextInt();
			System.out.println("국어점수를 입력하세요");
			student.kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			student.eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요");
			student.math = sc.nextInt();
			
			students[i] = student;
			return students;
		}
		
		
	}

	public Student makeStudent() {
		//키보드로 부터 이름, 번호, 국어,영어,수학 입력 리턴
		
		
		
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("번호을 입력하세요");
		int num = sc.nextInt();
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		//하나의 변수로 여러개의 데이터를 다루는법
		//1. 배열 - 같은 데이터타입만 가능 
		//2. class 
		Student student= new Student();
		student.name = name;
		student.num = num;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		
		
		return student;
		
		
	}
}