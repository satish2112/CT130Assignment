package Assignment1;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enetr a number you want Check :");
		int s=in.nextInt();
		int x=s;
		int fact;
		int sum=0;
		while(s>0) {
		int n=s%10;
		fact=1;
		for(int i=1;i<=n;i++) {
			fact =fact*i;
		}
		sum= fact + sum;
		s=s/10;
		}
		if(x==sum) {
			System.out.println(x+" is Stront Number");
		}else {
			System.out.println(x+" is not a Strong Number");
		}
	}
}