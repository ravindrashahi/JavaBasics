package javapractice;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{ 
		
	  int c=0;
	  int x=153;
	  String s=x+"";
	  int len=s.length();
	  System.out.println("length is "+ len);
	  for (int i=0;i<=len-1; i++)
	    {
		  char a= s.charAt(i);
		  int b= Character.getNumericValue(a);
		  System.out.println(b);
		  int mul=1;
		  for(int j=0; j<=len-1; j++)
		   {
			mul=mul*b;
		   }
		  c=c+mul;		 
		 }
	  System.out.println(c);
	  if (c==x)
	  {System.out.println("no is armstrongnumber");}
	  else {System.out.println("not an armstrong no");}
	}

}
