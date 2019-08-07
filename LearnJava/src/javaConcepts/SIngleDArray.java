package javaConcepts;

public class SIngleDArray {

	public static void main(String[] args) 
	{
      int[] a= new int[4];
      a[0]=10;
      a[1]=20;
      a[2]=30;
      a[3]=40;
      
//      for(int i=0; i<a.length; i++)      //using for loop
//        {
//	     System.out.print(a[i]+" ");
//        }
//      for(int i:a)                       //using for each
//      {
//    	  System.out.print(i+" ");
//      }
	int i=0;                               //using while loop
	while(i<a.length)
	{
		System.out.println(a[i]);
		i++;
	}
	}

}
