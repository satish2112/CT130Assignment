package Assignment2;
public class GreaterOfArray {
	public static void main(String[] args) {
		int a[]= {7,14,21,28,35,42,49,3,54,3,43,5,1};
		int b=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>b){
				b=a[i];
			}
		}
		System.out.println("greatest of Array="+b);
	}
}