package Hometask8_2__V2;

public class Good2 {
	double price; //цена за кг
	double weight;
	String name;
	
	//конструктор
	Good2() {
		price = 0;
		weight = 0;
	}
	
	Good2(double price) {
		this.price = price;
		weight = 0;
	}
	
	Good2(double price, double weight) {
		this.price = price * weight;
		this.weight = weight;
	}
	
	//сеттеры
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//геттеры
	public double getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
	
	

}
