package com.jong.s1;

public class StudentView {
	
	
	//학생들의 정보를 출력
	//메서드명 view
	
	public void view(Student[] student) {
		
		for(int i =0;i<student.length;i++ ) {
			System.out.println("이름 : "+student[i].name);
			System.out.println("번호 : "+student[i].num);
			System.out.println("국어점수 : "+student[i].kor);
			System.out.println("영어점수: "+student[i].eng);
			System.out.println("수학점수: "+student[i].math);
			System.out.println("총점 : "+student[i].total);
			System.out.println("평균 : "+ student[i].avg);
		}
	}
	
	
	public void viewStudent(Student student) {
		System.out.println("이름 : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("국어점수 : "+student.kor);
		System.out.println("영어점수: "+student.eng);
		System.out.println("수학점수: "+student.math);
		System.out.println("총점 : "+student.total);
		System.out.println("평균 : "+ student.avg);

	}
}
