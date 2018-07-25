package Bank;

public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("smith",32);
		Person p2=new Person("kathy",29);
		
		Account a1= new Account(2000,p1);
		Account a2= new Account(3000,p2);
		
		a1.Deposit(2000);
		a2.withdraw(2000);
		
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		
		System.out.println(a1.getAccNum());
		System.out.println(a2.getAccNum());
		
	}

}
