package Collection;

import java.util.ArrayList;

public class DuplicateValueRemove {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
	    lst.add("ABC");
	    lst.add("ABC");
	    lst.add("ABCD");
	    lst.add("ABCD");
	    lst.add("ABCE");

	    System.out.println("Duplicates List "+lst);

	    Object[] st = lst.toArray();
	      for (Object s : st) {
//	        if (lst.indexOf(s) != lst.lastIndexOf(s)) {
//	            lst.remove(lst.lastIndexOf(s));
//	         }
	    	  if(lst.contains(st)) {
	    		  System.out.println(" index "+s+" ");
	    	  }
	      }

	    System.out.println("Distinct List "+lst);
	}
}

