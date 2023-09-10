package Assignment1;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enetr First number:");
	int a=in.nextInt();
	System.out.print("Ente Second Number:");
	int b=in.nextInt();
	System.out.println("Before swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}