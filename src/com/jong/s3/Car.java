package com.jong.s3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		//default , 기본, 빈생성자
/*		color= "Red";
		brand = "Audi";
		cc= 3000;;*/
		
		this("Red");	//자신의 또다른 생성자를 호출
		
	}
	
	public Car(String color) {
		/*this.color = color;
		brand = "Audi";
		cc= 3000;;*/
		this(color,"Audi");
		
	}
	
	public Car(String color,String brand) {
		/*this.color=color;
		this.brand=brand;
		cc=3000;*/
		this(color,brand,3000);
	}
	public Car(String color,String brand,int cc) {
		this.color=color;
		this.brand=brand;
		this.cc=cc;
	}
		
	public void info() {
		System.out.println("Color : "+this.color);
		System.out.println("Brand : "+this.brand);
		System.out.println("Cc : "+this.cc);				// 전부 this 는 생략가능 헷갈릴때 사용
		this.make();
	}
	
	
	public void make() {
		System.out.println("자동차 제작 완료");
		
	}
	
	
	
}
