package Bank;

public class Account {
	private static long Num=0;
	private long accNum;
	private double balance;
	private Person accHolder;
	public Account() {
		
	}
	
	public Account(double balance, Person accHolder) {
		Num++;
		this.accNum=Num;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	void Deposit(double d) {
		balance+=d;
	}
	void withdraw(double w) {
		if(balance-500>=w) {
		balance-=w;
		}
	}
	double getBalance() {
		return balance;
	}
	public long getAccNum() {
		return this.accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	
}
