package Assignment2;
public class TernaryOperator {
	public static void main(String[] args) {
		int x=12,y=112,z=73;
		int t=(x>y && x>z)?x:(y>z && y>x)?y:z;
		System.out.println("Largest:"+t);	
	}
}