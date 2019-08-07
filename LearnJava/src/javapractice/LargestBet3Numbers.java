package javapractice;

public class LargestBet3Numbers {

	public static void main(String[] args) 
	{
      int a=12;
      int b=80;
      int c=5;
      
      if (a>b && a>c)
      {
    	  System.out.println("a is largest");
      }
      else if (b>c && b>a)
      {
    	  System.out.println("b is largest");
      }
      else 
      {
    	  System.out.println("c is largest");
      }
	}

}
