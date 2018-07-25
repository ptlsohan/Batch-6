import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str= sc.nextLine();
		System.out.println("Is String Positive?"+isPositive(str));
		
		
		System.out.println("Enter your choice:");
		int opt = sc.nextInt();
		switch(opt) {
		case 1:
			str = addString(str);
			System.out.println(str);
			break;
		case 2:	
			str = replaceOdd(str);
			System.out.println(str);
			break;
		case 3:	
			str = removeDup(str);
			System.out.println(str);
			break;
			
		case 4:
			
			str = replaceOddWithCaps(str);
			System.out.println(str);
			break;
		default:
			System.out.println("Invalid input");
		}
		
		
		sc.close();
	}
	static String addString(String str) {
		return str+str;
	}
	static String replaceOdd(String str) {
		for (int i=0; i < str.length(); i++){
	        if (i % 2 != 0){
	          str = str.substring(0,i) + "#" + str.substring(i+1, str.length());
	        }
	      }
		return str;
	}
	static String removeDup(String str) {
		StringBuilder sb = new StringBuilder();
		char[] c = str.toCharArray();
		 for (char ch : c) {
			 if (sb.indexOf(String.valueOf(ch)) != -1)
		            continue;
		        else
		            sb.append(ch);
		    }
		    return sb.toString();
	}
	static String replaceOddWithCaps(String str) {
		char[] c = str.toCharArray();
		for (int i=0; i < str.length(); i++){
	        if (i % 2 != 0){
	          c[i] = Character.toUpperCase(c[i]);
	        }
	      }
		return String.valueOf(c);
	}
	
	static boolean isPositive(String str) {
		char[] c = str.toCharArray();
		boolean b= true;
		for (int i=0; i < str.length()-1; i++){
			if(c[i]>c[i+1]) {
				b=false;
			}
	}
		return b;
			}
	
}
