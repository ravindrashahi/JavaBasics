package javapractice;

public class ReverseAString {

	public static void main(String[] args) 
	{
      String s="RavindraSinghShahi";
      int length=s.length();
      System.out.println("length is "+length);
      for (int i=s.length()-1; i>=0; i--)
      {
    	  char name = s.charAt(i);
    	  System.out.print(name);
      }
      
	}

}
