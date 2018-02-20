package com.jong.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("program Start");
		SchoolController school = new SchoolController();
		school.start();		//new SchoolController().start();  로 두줄을 합칠수 있다.  
							// school이 주소값  new SchoolController()도 주소값이므로 가능. 주소값에 있는 start메서드 실행
		
		//CF////////
		//객체 : 눈에 보이는 사물 또는 개념
		//학생 : 3명  , 1명당 object
		/*Scanner sc = new Scanner(System.in);
		Student [] ar = new Student[2];
		Student student = new Student();
		for(int i =0;i<ar.length;i++) {
			student.name = sc.next();
			ar[i]=student;
			System.out.println(ar[i].name);
		}
		///// 위 아래는 큰 차이가 잇음 객체 갯수의 차이 
		for(int i =0;i<ar.length;i++) {
			student = new Student();
			student.name = sc.next();
			ar[i]=student;
			System.out.println(ar[i].name);
		}*/
	}

}
