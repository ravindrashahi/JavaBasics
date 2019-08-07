package javaConcepts;

public class SelectionSort {

	public static void main(String[] args) 
	{
      String [] a= {"ravi","sandeep","naveen","manoj", "basant"};
      int k;
      String temp="";
      for(int i=0; i<a.length; i++)
      {    
    	  k=i;
    	  for(int j=i+1; j<a.length; j++)
    	  {
    		  if(a[k].compareTo(a[j])>0)
    		  {
    			k=j;  
    		  }
    	  }
    	  temp=a[i];
    	  a[i]=a[k];
    	  a[k]=temp;
      }
      for (int i=0; i<a.length; i++)
      {
    	  System.out.println(a[i]);
      }
	}

}
