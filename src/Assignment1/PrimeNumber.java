package Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Prime number Between 1 to 100");
		int i,j,count=0;
		for(i=2;i<=100;i++)
        {
           for(j=1;j<=i;j++)
           {
             if(i%j==0)
               count++;
           }
           if(count==2)
             System.out.print(" "+i);
           count=0;
        }
	}

}
