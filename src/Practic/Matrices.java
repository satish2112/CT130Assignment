package Practic;

import java.util.Scanner;

public class Matrices {
	public static boolean search(int matrix[][], int key) {
		int n = matrix.length, m = matrix[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == key) {
					System.out.print("FOUND AT KEY IS (" + i + "," + j + ")");

				}
				
			}
		}
		return false;
	}
	
	public static void smalest(int num[][]) {
		int largest = Integer.MIN_VALUE;
		int smallest= Integer.MAX_VALUE;
		for(int i=0; i<num.length;i++) {
			for (int j = 0; j < num[i].length; j++) {
				
			
			if(largest<num[i][j]){
				largest=num[i][j];			
			}
			if(smallest>num[i][j]) {
				smallest =num[i][j];
			}
		
			}
		}
		System.out.println("smallest value is:"+smallest);
		System.out.println("Largest value is:"+largest);
		}
	

	public static void main(String args[]) {
		int matrix[][] = new int[3][3];
		int n = matrix.length, m = matrix[0].length;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		smalest(matrix);
		search(matrix, 22);
	}
}