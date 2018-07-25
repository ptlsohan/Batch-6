import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;



public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Jack", "Sparrow",'M');
		System.out.println(p.toString());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB(yyyy-MM-dd):");
		String date = sc.nextLine();
		LocalDate d = LocalDate.parse(date);
		int age=calculateAge(d);
		System.out.println("Age: "+age);
		
		System.out.println("Full name:" + p.getFullName());
		
		
	}
	
	static int calculateAge(LocalDate d) {
		LocalDate now = LocalDate.now(); 
		Period diff = Period.between(d, now);
		return diff.getYears();
		}
	

}
