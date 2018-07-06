package Hometask8_2__V2;


public class Banana2 extends Good2 {
	static double fixedPrice = 3.2;
	public String name = "banana";

	// конструктор
	Banana2(double weight) {
		super(weight);
		price = fixedPrice * weight;
	}

	public String getName() {
		return name;
	}
	
	
	

}
