package Assignment2;
public class ArrayDiv5And7 {
	public static void main(String[] args) {
		int a[]= {7,14,21,28,35,42,49,56,63,70};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%7==0 && a[i]%5==0) {
				System.out.println("Number is divide by 7 and 5="+a[i]);
			}
		}
	}
}