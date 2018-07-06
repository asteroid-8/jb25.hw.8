
public class BankAccount {
	int accountId;
	double balance;
	
	public BankAccount(int accountId) {
		this.accountId = accountId;
		balance = 0;		
	}
	
	public BankAccount(int accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void show() {
		System.out.println("Номер счета: " + accountId + "\nОстаток: " + balance);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
		result = prime * result + accountId;
		return (int)result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
			
		if (getClass() != obj.getClass()) {
			return false;
		}
			
		BankAccount temp = (BankAccount) obj;
		
		if (this.balance != temp.balance) {
			return false;
		}
						
		return true;
	}
	
	@Override
	public String toString() {
		return "Номер счета: " + accountId + "\nОстаток на счете: " + balance;
	}
}
