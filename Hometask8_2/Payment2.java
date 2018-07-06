package Hometask8_2__V2;

import java.util.ArrayList;

public class Payment2 {
	public ArrayList<Good2> order;
	private double cheque;
	
	//�����������
	public Payment2(ArrayList<Good2> order) {
		this.order = order;		
	}
	
	//������ �����
	public double getCheque() {
		cheque = 0;
		for (Good2 x : order) {
			cheque += x.price;
		}
		System.out.println("\n� ������: " + cheque);
		return cheque;
	}
	
	public void show () {
		//System.out.println(order);
		System.out.println("��������� ������:");
		for (Good2 x : order) {
			System.out.println(x.getName() + "\t" + x.getPrice());
		}
	}

}
