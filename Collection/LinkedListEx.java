package Collection;
import java.util.*;
public class LinkedListEx {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		  LinkedList<String> al=new LinkedList<String>();
		  String ch;
		 try {
			 do {
				  System.out.println("1.Add Name\n2.Delete Name:\n3.Delete Last Name:\n4.Delete First Name:"
					  		+ "\n5.Add Name b/w list:\n6.Delete Name b/w list");
					  int choice = input.nextInt();
				  switch(choice) {
				  
				  case 1:
					  System.out.println("Enter the name :");
					  al.add(input.next());
					  break;
				  case 2:
					  System.out.println("Enter the name delete :");
					  al.remove(input.next());
					  System.out.println("Value deleted.");
					  break;
				  case 3:
					  al.removeLast();
					  System.out.println("Last Value deleted.");
					  break;
				  case 4:
					  al.removeFirst();
					  System.out.println("First Value deleted.");
					  break;
				  case 5:
					  System.out.println("Enter the name :");
					  String namee = input.next();
					  System.out.println("Enter the position:");
					  int ind = input.nextInt();
					  al.add(ind,namee);
					  System.out.println("Value added at "+ind+" position");
					  break;
				  case 6:
					  System.out.println("Enter the name :");
					  String name = input.next();
					  System.out.println("Enter the position:");
					  int index = input.nextInt();
					  al.remove(index);
					  System.out.println("Value deleted "+name+" .");
					  break;
				  }
				  
				 
				  System.out.println("Do you want to add more :(y/n)");
				  ch= input.next();
			  }while(ch.contentEquals("y"));
			  
			  
			  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  } 
			 al.toArray();
		 }
		 catch(InputMismatchException e) {
			 System.out.println(e);
		 }
		  
		  
	}
}
