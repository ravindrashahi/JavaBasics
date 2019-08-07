package javapractice;

public class InsertElementinArray {

	public static void main(String[] args) 
	{
      int[] a= {12,34,45,56,78,30};
      int num=100;
      int pos=4;
      
      for(int i=a.length-1; i>pos-1; i--)
      {
    	  a[i]=a[i-1];
      }
         a[pos-1]=num;
       for (int j=0; j<a.length; j++)
       {
    	   System.out.println(a[j]);
       }        
	}

}
