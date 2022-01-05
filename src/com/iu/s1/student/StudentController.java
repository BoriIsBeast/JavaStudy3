package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {
	
	public void  start() {
		
		System.out.println("Start Method");
			
			StudentUtil su = new StudentUtil();
			StudentView sv = new StudentView();
			
			boolean check = true;
			int select = 0;
			
			Student [] students = null;
			
			Scanner sc = new Scanner(System.in);
			
			while (check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 프로그램 종료");
	
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("입력");
				
				students = su.makeStudents();
				
				break;
				
			case 2 : 
				
				if (students != null) {
				System.out.println("출력");
				sv.viewStudents(students);
				}else {
					sv.viewMessage("학생정보를 먼저 입력하세요");
				}
				
				break;
				
			case 3:  //강사님꺼 보고 공부
				
				if (students == null) {
					sv.viewMessage("학생정보가 없습니다");
					continue;
				}
				Student student =	su.search(students);
				if(student != null ) {
					sv.viewStudent(student);
				}else {
					sv.viewMessage("검색결과가 없습니다");
				}
				break;
			default :
				System.out.println("프로그램을 종료합니다");
				check = false;
				
				
			}//switch의 끝
			
			
			}//while의 끝
}
}