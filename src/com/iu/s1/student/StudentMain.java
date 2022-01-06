package com.iu.s1.student;



import com.iu.s1.student.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentController sc = new StudentController();
		
//				sc.start();
		StudentView sv = new StudentView();
		Student student = new Student();
		student.name="iu";
		student.kor = 10;
		student.math = 10;
		student.eng = 10;
		
//		student.hello();
		student.makeTotal();
		
		sv.view(student);
//		System.out.println("참조변수 student : "+student);
//		System.out.println("Student Total : " + student.total);
//		
//		
//		
//		
//		
//		
//		
//		
//		Student student2 = new Student();
//		student2.kor = 20;
//		student2.eng = 20;
//		student2.math = 20;
//		
//		student2.makeTotal();
//		
//		System.out.println("Student Total2 : " + student2.total);
//		
//		System.out.println("참조변수 student2 : "+student2);
		
		
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
