package javapractice;

public class DeleteElementFromArray {

	public static void main(String[] args) 
	{
     int[] a= {12,34,20,30,40,60};
     int num=30;
     
     for(int i=0; i<a.length; i++)
     {
    	if(a[i]==num)
    	{
    		for (int j=i; j<a.length-1; j++)
    		{
    			a[j]=a[j+1];
    		}
    		break;
    	}
     }
     
     for(int k=0; k<a.length-1; k++)
     {
    	 System.out.println(a[k]);
     }
	}

}
