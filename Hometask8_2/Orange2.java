package Hometask8_2__V2;


public class Orange2 extends Good2 {
	static double fixedPrice = 4;
	public String name = "orange";

	// конструктор
	Orange2(double weight) {
		super(weight);
		price = fixedPrice * weight;
	}

	public String getName() {
		return name;
	}
	
	

}
