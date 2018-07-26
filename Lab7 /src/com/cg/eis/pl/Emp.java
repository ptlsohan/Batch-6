package com.cg.eis.pl;
import com.cg.eis.service.EmpService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.cg.eis.bean.Employee;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> hm= new HashMap<Integer, Employee>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			
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
			hm.put(emp.getId(), emp);
			System.out.println("Add more employee?(y/n):");
			char c = sc.nextLine().charAt(0);
			if(c=='n' || c=='N')
				break;
		}
		
		Set<Map.Entry<Integer, Employee>> entrySet = hm.entrySet();
		for (Entry entry : entrySet) {
			   Employee em = (Employee)entry.getValue();
			   System.out.println("key: " + entry.getKey() + " value: " + em.getDesignation());
			}
		List<Employee> empl = new ArrayList<Employee>(); 
		System.out.println("Enter Insurance scheme:");
		String ins = sc.nextLine();
		for (Entry entry : entrySet) {
			   Employee em = (Employee)entry.getValue();
			   String sch = em.getInsuranceScheme();
			   if(ins.equalsIgnoreCase(sch)) {
				   empl.add(em);
			   }
			   
			}
		for(Employee temp : empl) {
			System.out.println("Name: "+temp.getName());
		}
		
		System.out.println("Enter Employee id to delete:");
		int i = sc.nextInt();
		hm.remove(i);
		for (Entry entry : entrySet) {
			   Employee em = (Employee)entry.getValue();
			   System.out.println("key: " + entry.getKey() + " value: " + em.getDesignation());
			}
		EmpComp c = new EmpComp();
		List<Employee> list = new LinkedList<Employee>();
		for (Entry entry : entrySet) {
			Employee o=(Employee)entry.getValue();
			   list.add(o);
		}
		Collections.sort(list, c);
		
		for (Entry entry : entrySet) {
			   Employee em = (Employee)entry.getValue();
			   System.out.println("key: " + entry.getKey() +" Name: " + em.getName()+ " Salary: " + em.getSalary());
			}
		for(Employee temp : list) {
			System.out.println("Name: "+temp.getName()+" Salary:"+temp.getSalary());
		}
		
	}
	

}
class EmpComp  implements Comparator<Employee>{
	

	@Override
	public int compare(Employee o1, Employee o2) {
		 if (o1.getSalary() < o2.getSalary()) return -1;
	       if (o1.getSalary() > o2.getSalary()) return 1;
	        else return 0;
	}
}
