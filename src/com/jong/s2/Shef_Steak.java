package com.jong.s2;

public class Shef_Steak {

	public Food_Steak makeSteak(int select) {
		//1. 안심스테이크, 30000, 1번 소스
		//2. 등심스테이크, 40000, 2번 소스
		//3. 립스테이크, 50000, 1번 소스
		Shef_Source s = new Shef_Source();
		Food_Steak steak = new Food_Steak();
		switch (select) {
		case 1:
			steak.name = "안심스테이크 ";
			steak.price = 30000;
			steak.source = s.makeSource(1);
			
			break;
		case 2:
			steak.name = "등심스테이크";
			steak.price = 40000;
			steak.source = s.makeSource(2);
			break;
		case 3:
			steak.name = "립스테이크";
			steak.price = 50000;
			steak.source = s.makeSource(1);
			break;
		default:

		}

		return steak;

	}

}
