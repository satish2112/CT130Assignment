package Assignment3;
public class Vehicle {
	int id,salary;
	String name;
	public Vehicle(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public void display() {
		System.out.println("Id="+id+" Name="+name+" Salary="+salary);
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle(18104024, 1000, "Satish");
		v.display();	
	}
}