package javapractice;

public class MinNumberInArray {

	public static void main(String[] args) 
	{
      int[] a= {12,123,3,45,30,2,65};
      int min=a[0];
      
      for(int i=1; i<a.length; i++)
      {
    	  if (a[i]<min)
    	  {
    		  min=a[i];
    	  }
      }
      System.out.println("min number is "+min);
	}

}
