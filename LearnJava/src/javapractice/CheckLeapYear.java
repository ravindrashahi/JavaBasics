package javapractice;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) 
	{
     int x;
     System.out.println("enter year");
     Scanner s= new Scanner(System.in);
     x=s.nextInt();
     if((x%4==0 && x%100!=0) || x%400==0)
     {
    	 System.out.println("year is leap year");
     }
     else
     {
    	 System.out.println("year is not leap year");
     }
	}

}
