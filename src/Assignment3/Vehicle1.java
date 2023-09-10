package Assignment3;

public class Vehicle1 {
int id,salary;
String name,city,Gender;

	public Vehicle1() {}
	public Vehicle1(int id, int salary, String name, String city, String gender) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.city = city;
		Gender = gender;
	}
	public Vehicle1(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public void display() {
		System.out.println("Id="+id+" Name="+name+" Gender="+Gender+" Salary="+salary+" City="+city);
	}
	public static void main(String[] args) {
		Vehicle1 v1=new Vehicle1();
		Vehicle1 v2=new Vehicle1(18104049,"Yash","Thane");
		Vehicle1 v3=new Vehicle1(18104049,1000,"Yash","Thane","male");
		v1.display();
		v2.display();
		v3.display();
		
	}
}