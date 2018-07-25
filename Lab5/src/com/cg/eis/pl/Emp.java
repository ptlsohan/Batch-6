package com.cg.eis.pl;
import com.cg.eis.service.EmpService;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("Enter salary:");
			double salary = sc.nextDouble(); 
			sc.nextLine();
			System.out.println("Enter designation:");
			String desgn = sc.nextLine();
			
			Employee emp= new Employee(name, salary, desgn);
			
			EmpService eservice= new EmpService();
			String sch= eservice.findScheme(salary,desgn);
			emp.setInsuranceScheme(sch);
			
			System.out.println("Enter service no:");
			int num= sc.nextInt();
			switch(num) {
			case 1:
				String str=eservice.getDetail(emp);
				System.out.println("Employee detail"+str);
				break;
			case 2:
				System.out.println("Employee Scheme:"+eservice.findScheme(salary, desgn));
				break;
			case 3:
				eservice.displayAllDetails(emp);
				break;
			default:
			}
			
	}

}
