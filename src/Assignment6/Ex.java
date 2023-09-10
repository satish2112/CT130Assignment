package Assignment6;
class Car{
	int velocity=50;
	public void speed() {
		System.out.println("speed of car "+velocity+"Km/h");
	}
}
 class Duster extends Car{
	public void display() {
		super.speed();
		System.out.println("super");
	}
 }
  public class Ex {
  
  public static void main(String[] args) { 
	  Duster d=new Duster();
	  d.display();
  } 
 }
 