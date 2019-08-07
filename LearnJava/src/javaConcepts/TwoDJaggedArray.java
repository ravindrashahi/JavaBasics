package javaConcepts;

public class TwoDJaggedArray 
{
	public static void main(String[] args) 
	{
      int[][] a=new int[2][];
      a[0]=new int[4];
      a[1]=new int[2];  
      a[0][0]=10;
      a[0][1]=20;
      a[0][2]=30;
      a[0][3]=40;
      a[1][0]=50;
      a[1][1]=60;
      
      for(int i=0; i<a.length; i++)
      {
    	  for(int j=0; j<a[i].length; j++)
    	  {
    		  System.out.print(a[i][j]+" ");  
    	  }
    	  System.out.println();
      }
	}

}
