package com.jong.s1;

public class StudentView {
	
	
	//학생들의 정보를 출력
	//메서드명 view
	
	
	//같은 이름의 메서드를 여러개 생성하는 것
	//오버로딩
	//조건 : 메서드명이 같고, 매개변수의 타입이나 , 갯수가 달라야 한다.
	
	public void view(String message) {
		System.out.println(message);
	}
	
	
	public void view(Student student) {
		System.out.println("이름 : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("국어점수 : "+student.kor);
		System.out.println("영어점수: "+student.eng);
		System.out.println("수학점수: "+student.math);
		System.out.println("총점 : "+student.total);
		System.out.println("평균 : "+ student.avg);

	}
	
	
	public void view(Student[] students) {
		
		for(int i =0;i<students.length;i++ ) {
		/*	System.out.println("이름 : "+students[i].name);
			System.out.println("번호 : "+students[i].num);
			System.out.println("국어점수 : "+students[i].kor);
			System.out.println("영어점수: "+students[i].eng);
			System.out.println("수학점수: "+students[i].math);
			System.out.println("총점 : "+students[i].total);
			System.out.println("평균 : "+ students[i].avg);*/
			this.view(students[i]);	// 이렇게 줄일수 있다.

		}
	}
	
	

}
