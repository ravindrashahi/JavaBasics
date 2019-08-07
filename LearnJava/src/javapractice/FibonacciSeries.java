package javapractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int a;
		int b;
		int c;
		System.out.println("enter a");
		Scanner s1= new Scanner(System.in);
		a=s1.nextInt();
		System.out.println("enter b");
		Scanner s2= new Scanner(System.in);
		b=s2.nextInt();

		  for(int i=1; i<=10; i++) 
		  { c=a+b; System.out.print(" "+c+" "); 
		  a=b; b=c; 
		  }
		 
	}

}
