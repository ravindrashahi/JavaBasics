package javapractice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) 
	{
		int b=0;
		int x;
		System.out.println("enter no");
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
		for(int a=2; a<=x-1; a++)
		{
		  if (x%a==0)
		  {
			  b=b+1;
		  }		  
		}
		if (b>1)
		{
			System.out.println("no is not prime");
		}
		else 
		{
			System.out.println("no is prime");
		}
		
	}
}
