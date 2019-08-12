package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) 
	{
       //it extends map interface
	   //stores data in key-value pair
	   //stores unique values
	   //no null key and values are allowed
	   //is synchronised--hence slow performance--sequential threading
	   //key --> Object --Hashcode(32 bit int)--> value 
	  
		Hashtable<Integer, String> h1=new Hashtable<>();
		h1.put(1,"ram");
		h1.put(2,"naveen");
		h1.put(3,"basant");
		System.out.println("h1 values are: "+h1);
		
		//create a clone copy/shallow copy:
		Hashtable h2=new Hashtable();
		h2 = (Hashtable) h1.clone();
		System.out.println("h2 values are: "+h2);
		
		//erase all values
		h1.clear();
		System.out.println("h1 values are: "+h1);
		System.out.println("h2 values are: "+h2);
		
		//contains value
		if(h2.containsValue("ram"))
		{
			System.out.println("value is present");
		}
		
		//print all the values using --Enumeration--elements()
		  Enumeration en=h2.elements();
		  System.out.println("print all values");
		   while (en.hasMoreElements())
		   {   
			  System.out.println(en.nextElement());
		   }
		   
		 //get all values using entrySet() --set of hashtable values
		    Set val = h2.entrySet();
		    System.out.println(val);
		   
		 // check both hashtables are equal or not
			Hashtable<Integer,String> h3=new Hashtable();   
		    h3.put(1,"ram");
			h3.put(2,"naveen");
			h3.put(3,"basant");
			
			if (h2.equals(h3))
			{
				System.out.println("Both hashtables are equal");
			}
			
	     //get the value from a key
			String k=h3.get(2);
			System.out.println(k);
			
	     //get the hashcode of a hashtable object
			System.out.println("hashcode vale is: "+h3.hashCode());
	}

}
