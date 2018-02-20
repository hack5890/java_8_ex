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
	
	//메서드명은 addPoint
	//각학생의 점수 입력
	public void addPoint(Student[] student) {	// 학생의 정보가 담겨있는 배열의 주소값을 매개 변수로
		
		Scanner sc= new Scanner(System.in);	
		
		for(int i =0;i<student.length;i++) {
			System.out.println(student[i].name+"의 국어점수 입력");
			student[i].kor=sc.nextInt();
			System.out.println(student[i].name+"의  영어점수 입력");
			student[i].eng=sc.nextInt();
			System.out.println(student[i].name+"의 수학점수 입력");
			student[i].math=sc.nextInt();
			
			student[i].total = student[i].kor + student[i].eng + student[i].math;
			student[i].avg = student[i].total /3.0;
		}
				
	}
	
	
	
	
	
	
}
