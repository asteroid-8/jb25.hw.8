
public class Main {

	public static void main(String[] args) {
		
		BankAccount Marina = new BankAccount(1, 5000);
		BankAccount Vasya = new BankAccount(2);
		
		Marina.show();
		Vasya.show();
		
		if (Marina.equals(Vasya)) {
			System.out.println("�� ����� ������ ���������� ���������� �����.");
		} else {
			System.out.println("����� �� ������ ����������");
		}

	}

}
