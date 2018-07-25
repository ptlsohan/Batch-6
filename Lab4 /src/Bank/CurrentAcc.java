package Bank;

public class CurrentAcc extends Account {

	double overDraftLimit;

	public CurrentAcc(double overDraftLimit) {
		super();
		this.overDraftLimit = overDraftLimit;
	}
	
	void withdraw(double w) {
		double bal=getBalance();
		if(bal-w==overDraftLimit) {
		super.withdraw(w);
	
		}
		
	}

}
