package Hometask8_2__V2;

import java.util.ArrayList;

public class Payment2 {
	public ArrayList<Good2> order;
	private double cheque;
	
	//конструктор
	public Payment2(ArrayList<Good2> order) {
		this.order = order;		
	}
	
	//геттер счета
	public double getCheque() {
		cheque = 0;
		for (Good2 x : order) {
			cheque += x.price;
		}
		System.out.println("\nК оплате: " + cheque);
		return cheque;
	}
	
	public void show () {
		//System.out.println(order);
		System.out.println("Выбранные товары:");
		for (Good2 x : order) {
			System.out.println(x.getName() + "\t" + x.getPrice());
		}
	}

}
