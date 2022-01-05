package com.iu.s1.student;



import com.iu.s1.student.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentController start = new StudentController();
		
				start.start();
		
		
		//		StudentView sv = new StudentView();
//		StudentUtil su = new StudentUtil();
//		
//		Student [] students = new Student[2];
//		Student student = new Student();
//		
//		student.name = "보리";
//		student.num = 1;
//		student.kor = 10;
//		student.eng = 20;
//		student.math = 30;
//		
//		students[0] = student;
//		
//		student.name = "부리";
//		student.num = 2;
//		student.kor = 30;
//		student.eng = 20;
//		student.math = 10;
//		
//		
//		students[1] = student;
//		
//		//sv.viewStudents(students);
//	
//		Student student2 = su.search(students);
//		if(student2 != null) {
//		
//			sv.viewStudent(student2);
//		
//		}else {
//			sv.viewMessage("학생이없다");
//		}
//	    
//		
//		student.name = "보리";
//		student.num = 1;
//		student.kor = 10;
//		student.eng = 20;
//		student.math = 30;
//		
//		//sv.viewStudent(student);
//		
//		
//		
//	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		//1. Main Method
////		//   1) 프로그램 Start와 초기화
////		//   2) Test
////
////		//make Student 호출
////		// 이름,번호,국어 영어,수학 출력
////		StudentUtil studentUtil = new StudentUtil();
////		//Student student  = studentUtil.makeStudent();
////		Student [] students = studentUtil.makeStudents();
////
////		for(int i = 0;i<students.length;i++) {
////			Student student = students[i];
////
////			System.out.println("이름 :" + student.name);
////			System.out.println("번호 :" + student.num);
////			System.out.println("국어 :" + student.kor);
////			System.out.println("영어 :" + student.eng);
////			System.out.println("수학 :" + student.math);
////
////		}
//
//
//
}	

}
