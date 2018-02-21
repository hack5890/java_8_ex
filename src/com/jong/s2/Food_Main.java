package com.jong.s2;

public class Food_Main {

	public static void main(String[] args) {
		/*
		Shef_Source s = new Shef_Source();
		Food_Source source =s.makeSource(1);
		if(source!=null) {
		System.out.println(source.oilName);
		System.out.println(source.spiceName);
		}

		
		Shef_Steak ss = new Shef_Steak();
		Food_Steak steak = ss.makeSteak(3);
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilName);
		System.out.println(steak.source.spiceName);
		
		
		Shef_Pasta sp = new Shef_Pasta();
		Food_Pasta pasta= sp.makePasta(3);
		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilName);
		System.out.println(pasta.source.spiceName);*/
		
		
		Menu menu = new Menu();
		menu.order();
		
		
		/*Food_Pasta pasta = new Food_Pasta();
		pasta.name = "크림파스타";
		pasta.price = 15000;
		
		System.out.println(pasta.source);
		
		pasta.source = new Food_Source();
		
		System.out.println(pasta.source);
		System.out.println(pasta.source.oilName);
		
		
		pasta.source.oilName = "olive";
		pasta.source.spiceName = "hub";
		//소스 :  오일, 향신료
		
		Food_Pasta pasta2 = new Food_Pasta();
		
		System.out.println(pasta2.source.oilName);	// source 가 null 이기 때문에 에러
		
		
		for(int i = 0; i< 2 ; i++) {
			Food_Steak steak = new Food_Steak();
			steak.name = "티본스테이크";
			steak.price = 40000;
		}*/

	}

}
