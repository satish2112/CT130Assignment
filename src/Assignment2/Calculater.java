package Assignment2;
import java.util.Scanner;
public class Calculater {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First Number=");
		int a=in.nextInt();
		System.out.println("Enter Second Number=");
		int b=in.nextInt();
		
		System.out.println("Addition of two number="+(a+b));
		System.out.println("subtraction of two number="+(a-b));
		if(a>b) {
			float c= (float) a/b;
		System.out.println("division of two number="+c);
		}else {
			System.out.println("Can't be division");
		}
		System.out.println("multiplication of two number="+(a*b));
	}
}