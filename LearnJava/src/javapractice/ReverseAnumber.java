package javapractice;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) 
	{
        int quo;
		int rem;
        int num;
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        num=s.nextInt();
      while (num!=0)
      {
    	  rem=num%10;
          quo=num/10;
		  num=quo;
		  System.out.print(rem);
	  }
	}

}
