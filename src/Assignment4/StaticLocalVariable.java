package Assignment4;

public class StaticLocalVariable {
	int num1=6;
	static int num2=10;
	public static void main(String[] args) {
		StaticLocalVariable s1=new StaticLocalVariable();
		StaticLocalVariable s2=new StaticLocalVariable();
		s1.num1=15;
		s1.num2=17;
		s2.num1=22;
		s2.num2=28;
		System.out.println(s1.num1+" "+s1.num2+" "+s2.num1+" "+s2.num2);
				
	}

}
