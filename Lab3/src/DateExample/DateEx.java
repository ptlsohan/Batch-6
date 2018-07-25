package DateExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		//System.out.println("Enter 1st date(yyyy-MM-dd):");
		
		//String dt= sc.nextLine();
		/*SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
		 Date date1 =new Date();
		try {
		date1=dateformat.parse(dt); 
		 }catch (ParseException e) {
			 e.printStackTrace();
	        }
		System.out.println(date1);
		
		Date d2 = Date.now();*/
		
		/*LocalDate localDate = LocalDate.parse(dt);
		
		System.out.println("Enter 2st date(yyyy-MM-dd):");
		
		String dt2= sc.nextLine();
		LocalDate localDate2 = LocalDate.parse(dt2);;
 
        Period diff = Period.between(localDate, localDate2);
        System.out.println("Difference is "+diff.getYears() +" years, "+diff.getMonths() +" months and "+diff.getDays() +" days");

        System.out.println("Enter product purchase date(yyyy-MM-dd):");
		
		String pdt= sc.nextLine();
		LocalDate pDate = LocalDate.parse(pdt);
		System.out.println("Enter warrantee period:");
		int w=sc.nextInt();
		LocalDate eDate = pDate.plusDays(w);
		
		System.out.println("Product expires on: "+eDate);*/
		
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Enter Zone Id:");
		String id= sc.nextLine();
		df.setTimeZone(TimeZone.getTimeZone(id));
		System.out.println("Zone time: "+df.format(date));
        sc.close();
	}

}
