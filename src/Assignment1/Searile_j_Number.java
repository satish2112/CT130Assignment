package Assignment1;
public class Searile_j_Number {

	public static void main(String[] args) {
		int i=1;
			for( i=1;i<=5;i++) {
				int k=i;
				for(int j=1;j<=i;j++) {
					System.out.print(k+" ");
					k=k +5-j;
			}
			System.out.println();
		}
	}
}