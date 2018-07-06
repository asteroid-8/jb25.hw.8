package Hometask8_2__V2;


public class Apple2 extends Good2 {
	static double fixedPrice = 2.5;
	public String name = "apple";

	// конструктор
	Apple2(double weight) {
		super(weight);
		price = fixedPrice * weight;		
	}

	public String getName() {
		return name;
	}
	
	

}
