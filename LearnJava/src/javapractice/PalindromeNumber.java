package javapractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
      int num;
      int rem;
      String trem ="";
      int quo;
      System.out.println("enter a number");
      Scanner s = new Scanner(System.in);
      num=s.nextInt();
      String tnum = num+"";
      while (num!=0)
      {
    	  rem=num%10;
    	  quo=num/10;
    	  num=quo;  
    	  trem=trem+rem;
      }
      System.out.println(trem);
		  
          if(tnum.equals(trem))
		    { System.out.println("it is palindromic no");
		    } 
		  else {
		     System.out.println("  not a palindromic no"); 
		     }
		 
      
	}
	

}
