package javapractice;

public class MissingNumberInArray {

	public static void main(String[] args) 
	{
      int[] a= {1,2,3,4,6,7};
      int exp_element=a.length+1;
      int total_sum=(exp_element*(exp_element+1))/2;
      int sum=0;
      for(int i=0; i<a.length; i++)
      {
    	  sum=sum+a[i];
      }
      int missing_num=total_sum-sum;
      System.out.println("missing num is "+ missing_num);
	}

}
