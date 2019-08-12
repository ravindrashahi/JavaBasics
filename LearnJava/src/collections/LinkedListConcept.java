package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args)
	{
	  //can contain duplicate elements
	  //maintains insertion order
	  //non synchronized
	  //insertion/deletion is fast because no shifting needs to occur
	  //retrieval is slow
		
      LinkedList<String> ll= new LinkedList<>();
      ll.add("qa");
      ll.add("auto");
      ll.add("dev");
      ll.add("sel");
      //print
     System.out.println(ll);
	
     //addFirst
     ll.addFirst("qtp");
     //addLast
     ll.addLast("rpa");
     System.out.println(ll);
     
     //get
     System.out.println(ll.get(0));
     //set
     ll.set(0,"rft");
     System.out.println(ll.get(0));
     
     //removeFirst
     ll.removeFirst();
     //removeLast
     ll.removeLast();
     System.out.println(ll);
     
     //removeAtParticularIndex
     ll.remove(0);
     System.out.println(ll);
     System.out.println("**********************");
     
     //print all values of linked list
     // using for loop
     for (int i=0; i<ll.size(); i++)
     {
    	 System.out.println(ll.get(i));
     }
     System.out.println("*********************");
     
     //using iterator
     Iterator<String> i= ll.iterator();
     while(i.hasNext())
     {
    	 String value = i.next();
    	 System.out.println(value);
     }
     System.out.println("**********************");
     
     //using for-each loop
     for(String s:ll)
     {
    	 System.out.println(s);
     }
     System.out.println("********************");
     
     //using while loop 
     int j=0;
     while (ll.size()>j)
     {
    	 System.out.println(ll.get(j));
    	 j++;
     }
	}

}
