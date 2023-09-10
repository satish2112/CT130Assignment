package Assignment2;
public class ArrayNotDivBy3 {
	public static void main(String[] args) {
		int a[]= {7,14,21,28,35,42,49,56,63,70};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%3!=0) {
				System.out.println("Number is not divide 3="+a[i]);
			}
		}
	}
}