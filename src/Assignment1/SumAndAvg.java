package Assignment1;
public class SumAndAvg {
	public static void main(String[] args) {
		int a[]= {2,34,5,3,7,8,4,5,33,45,44,44};
		int temp=0;
		  for (int i = 0; i < a.length; i++) {
			temp=temp +a[i];
		}
		  System.out.println("Sum of Array="+temp);
		  System.out.println("Avg of Array="+(temp/a.length));
	}
}