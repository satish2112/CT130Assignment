package Assignment1;

import java.util.Scanner;

public class LowerOrUperCase {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Char:");
		char c=in.next().charAt(0);
		if (c>='A' && c<='Z') {
			System.out.println("Cher is upperscase:"+c);
		}else if(c>='a' && c<='z'){
			System.out.println("char is lowercase:"+c);
		}else {
			System.out.println("Not a valid Char:"+c);
		}
	}
}