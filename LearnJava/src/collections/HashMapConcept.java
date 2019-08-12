package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) 
	{
        //it is a class that implements map interface
		//extends abstract map
		//contains only unique keys but multiple dulicate values
		//stores the data in key-value pair
		//may have one null key and multiple null values
		//it maintains no order
		//hashmap is non-synchronised  --not thread safe
		//concurrent modification exception -- Fail-Fast condition
		
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(1,"ravindra");
		hm.put(2,"amit");
		hm.put(3,"vikash");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println("**************");
		
		//to traverse all values
		
		for(Entry e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue()); 
		}
		System.out.println("********************");		
		
		HashMap<Integer, Employee> hm1=new HashMap<Integer, Employee>();
		
		Employee e1= new Employee("wipro", "amit" , 01);
		Employee e2= new Employee("hcl", "basant" , 02);
		Employee e3= new Employee("tcs", "sumit" , 03);
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
        for (Entry<Integer, Employee> en:hm1.entrySet())
        {
        	int key = en.getKey();
        	Employee value = en.getValue();
        	System.out.println(key);
        	System.out.println(value.company+" "+value.empId+" "+value.name);

        }
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
