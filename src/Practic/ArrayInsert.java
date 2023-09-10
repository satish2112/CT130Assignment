package Practic;
import java.util.Arrays;

public class ArrayInsert {
	static void insertbeg(int arr[],int n,int s) {
		for (int i = arr.length; i <=0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=s;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,3,78,9,9,0};
		int s=8;
		int n = arr.length;
		insertbeg(arr,n,s);
		System.out.println(Arrays.toString(arr));
	}

}
