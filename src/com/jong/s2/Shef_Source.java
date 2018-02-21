package com.jong.s2;



public class Shef_Source {
	Food_Source source =null;
	public Food_Source makeSource(int select) {
		switch (select) {
		case 1:
			source = new Food_Source();

			source.oilName = "Olive";
			source.spiceName = "Hub";
			break;

		case 2:
			source = new Food_Source();

			source.oilName = "Milk";
			source.spiceName = "Cheese";
			break;
		default:

		}

		return source;



		/*Food_Source source = new Food_Source();

		source.oilName = "Olive";
		source.spiceName = "Hub";*/

		//oilName = "Milk"
		//spiceName =  "Cheese"

	}

}
