package Assignment1;

import java.util.Scanner;

public class CheckSqure {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enetr length:");
		int length=in.nextInt();
		System.out.print("Ente Breadth:");
		int breadth=in.nextInt();
			if(length== breadth){
				System.out.print("IT is Squre");
			}
			else{
				System.out.print("It is not a squre");
			}
	}
}
