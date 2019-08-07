package javapractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsUsingSet {

	public static void main(String[] args) 
	{
		int[] a= {23,12,14,44,54,12,14,12};
		Set<Integer> s= new HashSet<>();
		for(int value:a)
		{
			if (s.add(value)==false)
			{
				System.out.println(value); 
			}
		}
	}

}
