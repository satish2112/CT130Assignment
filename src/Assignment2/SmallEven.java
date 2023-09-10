package Assignment2;
public class SmallEven {
	public static void main(String[] args) {
		int a[]= {9,14,21,28,35,42,49,3,54,3,43,5,2,1,67,2,6773};
		int c=a[0];
		for (int i = 0; i < a.length; i++) { //two compare with largest value
			if(a[i]>c) {
				c=a[i];
			}
		}
		int b=c;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0){
				if(a[i]<b)
				b=a[i];
			}
		}
		System.out.println("greatest of even Array="+b);
	}
}