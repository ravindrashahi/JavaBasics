package javapractice;

public class FindDuplicateElementsInArray 
{
	public static void main(String[] args) 
	{
      int[] a= {12,33,1,45,56,12,56,29,1,45};
      
      for(int i=0;i<a.length; i++)
      {
    	  for(int j=i+1; j<a.length; j++)
    	  {
    	     if(a[i]==a[j] && i!=j)
    	       {
    		    System.out.println(a[j]);
    	       }
    	  }
      }
	}
}
