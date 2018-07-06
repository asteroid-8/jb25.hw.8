package Hometask8_2__V2;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Good2> bag = new ArrayList<Good2>();
		Apple2 app = new Apple2(3);
		Banana2 ban = new Banana2(2.4);
		Orange2 or = new Orange2(1);
		bag.add(app);
		bag.add(ban);
		bag.add(or);
		
		
		Payment2 pay1 = new Payment2 (bag);
		
		pay1.show();
		pay1.getCheque();

	}

	

}
