package Assignment5;
class Bank{
	private int id,salary;
	private long account_no;
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String name,city;

}
public class ExampleEncapsulation {
	public static void main(String[] args) {
		Bank b=new Bank();
	b.setName("Satish");
	b.setId(18104024);
	b.setSalary(25000);
	b.setAccount_no(569302130001048L);
	b.setCity("Thane");
	
	System.out.println("ID="+b.getId());
	System.out.println("Name="+b.getName());
	System.out.println("Account_no="+b.getAccount_no());
	System.out.println("Salary="+b.getSalary());
	System.out.println("City"+b.getCity());
	}
}