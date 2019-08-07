package javapractice;

public class Swap2NoUsingThirdVariable {

	public static void main(String[] args)
	{
      int x=2;
      int y=3;
      int z=y;
       y=x;
       x=z;
      System.out.println("now x is  "+x+"  now y is "+y);
	}

}
