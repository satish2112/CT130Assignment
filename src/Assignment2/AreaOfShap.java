package Assignment2;
import java.util.Scanner;
public class AreaOfShap {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=0;

		do{
		System.out.println("\n0.End The Calculation\n1.Area of circle \n2.Area of Triangle\n3.Area of Square\n4.Area of Rectangle\n");
		System.out.println("Enter Your choice:");
		 n=in.nextInt();
		switch (n) {
		case 1: {
			System.out.println("Enter Radius:");
			double r=in.nextDouble();
			double area = Math.PI*(r*r);  
			System.out.println("Area of Circle="+area);
			break;
		}
		case 2:{
			System.out.println("Enter length:");
			double length=in.nextDouble();
			System.out.println("Enter Breadth:");
			double breadth=in.nextDouble();
			double area=0.5*length*breadth;
			System.out.println("Area of Triangle="+area);
			break;
		}
		case 3:{
			System.out.println("Enter sides of square");
			double side=in.nextDouble();
			System.out.println("Area of Square="+(side*side));
			break;
		}
		case 4:{
			System.out.println("Enter length:");
			double length=in.nextDouble();
			System.out.println("Enter width:");
			double width=in.nextDouble();
			double area=length*width;
			System.out.println("Area of Rectangle="+area);
			break;
		}
		default:
			if(n==0) {
			System.out.println("End Off case");
			}else {
				System.out.println("Enter a valid Choice");
			}
			break;
		}
		}while(n != 0);
		System.out.println("Thank for using");
	}
}