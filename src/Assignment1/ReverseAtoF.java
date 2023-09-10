package Assignment1;
public class ReverseAtoF {
	public static void main(String[] args) {
		int alphabet=65;
		for(int i=1;i<=7;i++) {
			alphabet=71;
			for(int j=1;j<=i;j++) {
		
				System.out.print((char)(alphabet-- )+" ");
			}
			System.out.println();
		}
	}
}