package Practic;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter firts number: ");
	int a=in.nextInt();
	System.out.println("Enter Second number: ");
	int b=in.nextInt();
	
	System.out.println("Before swap a= "+a+" b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap a= "+a+" b= "+b);
	}
}