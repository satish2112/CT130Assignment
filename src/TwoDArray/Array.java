package TwoDArray;

public class Array {

	public static void main(String[] args) {
		int [][] x=new int[2][]; //another way to create array in twoDArray we just have to add row valve we can also add coloum value
		int[][] s= {
			{22,12,2},
			{24,55,66,77},
			{33,67,55,55,33},
			{13,57,83,84}
		};
	int find=84;
	search(s,find);	
	}

	static void search(int[][] s, int find) {
		int min=s[0][0],max=s[0][0];
		int x=Integer.MIN_VALUE;
		for (int i = 0; i < s.length; i++) {	
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j]==find) {
					System.out.println("["+i+"]"+"["+j+"]");
				}
				if (s[i][j]>=max) {
					max=s[i][j];
				}
				if (s[i][j]<=min) {
					min=s[i][j];
				}
			}
		}
		System.out.println("MIN: "+min +"\nMAX: "+max);
	}
}