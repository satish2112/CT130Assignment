package Assignment1;
import java.util.Arrays;
public class DescendingArray {
	public static void main(String[] args) {
	int a[]= {2,34,5,3,7,8,4,5,33,45,44,44};
	int temp;
	System.out.println("*******Before Short*******");
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<=a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
	System.out.println("*******After Short*******");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}
}