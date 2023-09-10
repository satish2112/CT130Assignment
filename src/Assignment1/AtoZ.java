package Assignment1;

public class AtoZ {

	public static void main(String[] args) {
		int alphabet=65;
		for(int i=1;i<=7;i++) {
			alphabet=64 +i;
			for(int j=1;j<=i;j++) {
				
				System.out.print((char)(alphabet++ )+" ");
				alphabet =alphabet +6-j;
			}
			System.out.println();
		}
	}
}