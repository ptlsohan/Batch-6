package sample;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Jack", "Sparrow",'M');
		System.out.println(p.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String n1=sc.nextLine();
		System.out.println("Enter last name:");
		String n2=sc.nextLine();
		System.out.println("Enter gender(M/F):");
		char g=sc.next().charAt(0);		
		try {
		if(n1.equals(" ") || n1.length()==0 || n2.equals(" ") || n2.length()==0) {
			throw new BlankFieldException();
		
		}else {
			Person p1=new Person(n1,n2,g);
		}
		} catch(BlankFieldException e) {
			System.out.println("Firstname/Lastname cannot be blank");
		}
	}

}
