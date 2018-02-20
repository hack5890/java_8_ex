package com.jong.s1;

import java.util.Scanner;

public class StudentService {
	
	//학생 추가 메서드
	//메서드명 addStudent
	//학생의 인원수를 입력하세요
	//학생수 만큼
	//이름입력
	//번호입력
	
	public Student[] addStudent() {
		Scanner sc= new Scanner(System.in);	
		System.out.println("학생의 인원수를 입력하세요");
		int num= sc.nextInt();		
		Student [] student = new Student[num];	
		
		
		for(int i =0;i<student.length;i++) {	
			Student stu = new Student();	
			student[i]=stu;	
			System.out.println("이름입력 : ");
			student[i].name=sc.next();
			System.out.println("번호입력: ");
			student[i].num=sc.nextInt();	
			
			
		}
		
		return student;
		
	}
	
}
