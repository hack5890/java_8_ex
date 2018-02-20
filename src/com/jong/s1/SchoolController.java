package com.jong.s1;

import java.util.Scanner;

public class SchoolController {
	//메서드 명은  start 
	//return  x
	//내용 
	//1 . 학생 등록(추가)
	//2 . 성적 입력
	//3 . 성적 조회
	//4 . 전체 조회
	//5 . 프로그램 종료
	public void start() {
		int select = 0;
		boolean check = true;
		Scanner sc= new Scanner(System.in);
		while(check) {
		System.out.println("번호를 입력해주세요");
		System.out.println("1 . 학생 등록");
		System.out.println("2 . 성적 입력");
		System.out.println("3 . 성적 조회");
		System.out.println("4 . 전체 조회");
		System.out.println("5 . 프로그램 종료");
		select = sc.nextInt();
		if(select==1) {
			//학생 등록
			System.out.println("1 . 학생 등록");
		
		}else if(select==2) {
			//성적 입력
			System.out.println("2 . 성적 입력");
		}else if(select==3) {
			//성적 조회
			System.out.println("3 . 성적 조회");
		}else if(select==4) {
			//전체 조회
			System.out.println("4 . 전체 조회");
		}else if(select==5) {
			//프로그램 종료
			System.out.println("5 . 프로그램 종료");
			check = !check;
		}else {
			System.out.println("없는 번호입니다.");
		}
		}
		
	}
	
	
	
	
	
}
