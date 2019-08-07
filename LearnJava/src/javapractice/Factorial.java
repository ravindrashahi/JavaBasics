package javapractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int k=1;
		int x;
		System.out.println("enter number");
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
      for (int i=x; i>=1; i--)
      {
    	 k=i*k;
      }
      System.out.println(k); 
	}

}
