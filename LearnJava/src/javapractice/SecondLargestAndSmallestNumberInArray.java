package javapractice;

public class SecondLargestAndSmallestNumberInArray 
{

	public static void main(String[] args) 
	{
      int[] a= {12,45,2,6,34,28,4,5};
       int temp=0;
      
      for(int i=0; i<a.length; i++)
      {
    	 for(int j=i+1;j<a.length; j++)
    	 {
    		 if(a[j]>a[i])
    		 {
    			 temp=a[j];
    			 a[j]=a[i];
    			 a[i]=temp;
    		 }
    	 }
      }
      System.out.println("second largest no is "+a[1]);
      System.out.println("second smallest no is "+a[a.length-2]);
	}
}


