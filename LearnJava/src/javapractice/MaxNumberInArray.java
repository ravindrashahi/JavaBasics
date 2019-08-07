package javapractice;

public class MaxNumberInArray {

	public static void main(String[] args) 
	{
      int[] a= {23,12,123,4,56,564,221};
      int max= a[0];
      
      for(int i=1; i<a.length; i++)
      {
    	  if(a[i]>max)
    	  {
    		  max=a[i];
    	  }
      }
      
      System.out.println("max number is "+max);
	}

}
