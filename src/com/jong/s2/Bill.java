package com.jong.s2;

public class Bill {
	
	// 스테이크 먹었을때 영수증과 파스타먹었을때 영수증 2개 (메서드 두개)
	
	//Steak
	public void billSteak(Food_Steak steak) {
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilName);
		System.out.println(steak.source.spiceName);
	}
	
	//Pasta
	public void billPasta(Food_Pasta pasta) {
		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilName);
		System.out.println(pasta.source.spiceName);
	}
	
	
	
	
}
