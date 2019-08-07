package javapractice;

public class primeNumRange {

	public static void main(String[] args) 
	{
	 
      for(int i=1; i<=50; i++)
      {   
    	  int k=0;
    	  for(int j=2; j<i;j++)
    		{ 
    		  if(i%j==0)
    		  {
    			  k=k+1;			 
    		  }
        	}
    	  if(k==0)
    	  {if(i!=1)
    		  System.out.println(i);
    	  }
      }
	}

}
