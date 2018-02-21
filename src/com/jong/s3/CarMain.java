package com.jong.s3;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.info();
		
		
		Car c2 = new Car("Black");
		c2.info();
		
		Car c3 = new Car("Blue","Kia");
		c3.info();
		
		Car c4 = new Car("gray","benz",2000);
		c4.info();
		
	}
}
