package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
      //it is dynamic in nature---no fixed size
	  //can contain duplicate values/elements
      //maintains insertion order
	  //synchronized
	  //allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar= new ArrayList();   //non-generic
		ArrayList<Integer> ar1= new ArrayList<Integer>();   //generic
		
		ar.add(0, 10);
		ar.add(1, 20);
		ar.add(2, 30);
		ar.add(3, 10);
		ar.add(4, "ravindra");
	
		System.out.println(ar.size());  //size of array
		System.out.println(ar.get(3));  //to get the value from an index
		
		//print all the values of arraylist
		// for loop
		// iterator
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i)+" ");
		}
		//****************************************************
				
		//Employee class objects
		Employee e1= new Employee("ibm","ram",12);
		Employee e2= new Employee("hcl","naveen",13);
		Employee e3= new Employee("adobe","manoj",14);
		
		ArrayList<Employee> ar2= new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		//iterator to traverse the values
		Iterator<Employee> i=ar2.iterator();
		while (i.hasNext())
		{
			Employee value = i.next();
			System.out.println(value.company);
			System.out.println(value.name);
			System.out.println(value.empId);
			System.out.println("***********************************");
		}
				
		//addall()
		ArrayList<String> ar3= new ArrayList<String>();
		ar3.add("qa");
		ar3.add("dev");
		ar3.add("admin");
		
		ArrayList<String> ar4= new ArrayList<String>();
		ar4.add("java");
		ar4.add("python");
		ar4.add("c++");
		
		ar3.addAll(ar4);
		for(int j=0; j<ar3.size(); j++)
		{
			System.out.println(ar3.get(j));
		}
		System.out.println("*****************************");
		
		//removeall()		
		ar3.removeAll(ar4);
		for(int j=0; j<ar3.size(); j++)
		{
			System.out.println(ar3.get(j));
		}
		System.out.println("***********");
		
		//retainall()
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("a");
		ar5.add("b");
		ar5.add("c");
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("d");
		ar6.add("b");
		ar6.add("f");
		
		ar5.retainAll(ar6);
		for(int j=0; j<ar5.size(); j++)
		{
			System.out.println(ar5.get(j));
		}
	}

}
