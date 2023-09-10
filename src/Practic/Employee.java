package Practic;
import java.util.*;
class EmployeeData{
	int id,salary;
	String name;
	
	public EmployeeData(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}	
}
public class Employee {
	public static void main(String[] args) {
		EmployeeData e1=new EmployeeData(1, "Ajinky", 5000);
		EmployeeData e2=new EmployeeData(2, "Girish", 6000);
		EmployeeData e3=new EmployeeData(3, "Satish", 7000);
		EmployeeData e4=new EmployeeData(4, "Aman", 8000);
		EmployeeData e5=new EmployeeData(5, "Sagar", 9000);
		ArrayList<EmployeeData> s= new ArrayList<EmployeeData>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
//		Collections.sort(s);
		for (EmployeeData ep : s) {
			System.out.println("Employee ID: " +ep.id); 
		    System.out.println("Employee name: " +ep.name); 
		    System.out.println("Employee number: " +ep.salary); 
		}
		double sum=0;
		for (EmployeeData e : s) {
			sum=sum+e.salary;
		}
	System.out.println("Avg Salary="+(sum)/s.size());
	}
}