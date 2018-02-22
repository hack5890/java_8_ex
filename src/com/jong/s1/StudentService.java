package com.jong.s1;

import java.util.Scanner;

public class StudentService {

	//학생 추가 메서드
	//메서드명 addStudent
	//학생의 인원수를 입력하세요
	//학생수 만큼
	//이름입력
	//번호입력
	Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	
	
	public Student[] addStudent() {
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


	//search 메서드명
	//번호를 입력받아서 학생 한명을 찾아서
	//해당학생 출력은 StudentView class의 viewStudent메서드에서 출력
	/*public Student search(Student[] student) {
		Scanner sc= new Scanner(System.in);	
	
		int index = 0;
		System.out.println("찾을 학생의 번호를 입력해 주세요");
		int num = sc.nextInt();
		for(int i =0;i<student.length;i++) {
			if(num==student[i].num) {
				index=i;
			}
		}
		return student[index];
	}*/

	public Student search(Student[] students) {
		System.out.println("학생 번호를 입력하세요");
		int num= sc.nextInt();
		Student student =null;
		for(int i = 0; i<students.length;i++) {
			if(num==students[i].num) {
				student = students[i];
				break;
			}		
		}
		return student;
	}


}
