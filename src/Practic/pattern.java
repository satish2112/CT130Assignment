package Practic;

import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
//     Scanner s= new Scanner(System.in);
//     System.out.print("Enter the string");
//     String st=s.next();
//     System.out.println("Enter the size of hexagon");
     int n=12;
//     System.out.print("Enter the stating point between 0 to size of hexagon");
//     int start=s.nextInt();
     int m=n/6;
     int c=1+m;
     //upper part
     String s="satish";
     int q=s.length();
     int count=0,x10=0;
     for(int i=0;i<c;i++){
       for(int h=0;h<=c;h++){
        if(i==(c-h)){
        	if(count<2) {
            System.out.print("*"+" ");
            count++;
        	}else {
        		 System.out.print(s.charAt(x10)+" ");
        		 x10++;
        	}
        }
        else{
            System.out.print("  ");
        }
       }
       for(int j=1;j<=c;j++){
        if(j==i){
        	if(count<2) {
                System.out.print("*"+" ");
                count++;
            	}else {
            		 System.out.print(s.charAt(x10)+" ");
            		 x10++;
            	}
        }
        else{
            System.out.print("  ");
        }
       }
       System.out.println();
     }
     
     //middle part
     int x=m-1;
     for(int i=0;i<x;i++){
        for(int j=0;j<=c;j++){
            if(j==1){
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        for(int k=1;k<c;k++){
            if(k==(c-1)){
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
     }
     //below part
     for(int i=1;i<=c;i++){
        for(int j=0;j<=c;j++){
         if(j==i){
             System.out.print("*"+" "); 
         }
         else{
             System.out.print("  ");
         }
        }
        for(int h=1;h<=c;h++){
            if(i==(c-h)){
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
           }
        System.out.println();
      }
    }
}