package javapractice;

public class MergeTwoArrays {

	public static void main(String[] args) 
	{
      int[] a= {10,12,23,34,20};
      int[] b= {21,22,80,40,4};
      int length=a.length+b.length;
      int[] c= new int[length];
      
     
    	  for(int i=0; i<a.length; i++)
    	  {
    	     c[i]=a[i];
    	  }
		 for(int k=0; k<b.length; k++)
    	  {
    		  c[a.length+k]=b[k];
    	  }
    	  
    	  for(int j=0; j<length; j++)
    	  {
    		  System.out.println(c[j]);
    	  }
  	}
}
