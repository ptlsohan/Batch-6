package Bank;

public class SavingsAcc extends Account {

	final double minBal;

	public SavingsAcc(double minBal) {
		super();
		this.minBal = minBal;
	}
	
	void withdraw(double w) {
		double bal=getBalance();
		if(bal>=minBal) {
		super.withdraw(w);
		}
	}

}
