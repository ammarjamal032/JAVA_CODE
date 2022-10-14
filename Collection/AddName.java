
package Collection;
import java.util.*;
public class AddName {
	public static void main(String[] args) {
		Scanner input 	= new Scanner(System.in);
		ArrayList<String> ar 	= new ArrayList<String>();
		//1. add data
		ar.add("Cat");
		ar.add("Dog");
		ar.add("Cow");
		ar.add("Loin");
		System.out.println("List of Animal:");
		System.out.println(ar);
		
		//perticuller place.
		System.out.println("\nList of Animal:");
		ar.add(0, "Tiger");
		System.out.println("\n"+ar);
		
		System.out.println("\nName of Animal:");
		// get data perticuller place
		System.out.println("\n"+ar.get(4)+"\n");
		
		
		
		//sorting the list
		System.out.println("\nSorted:");
				Collections.sort(ar);
				Collections.reverse(ar);
				//after sorting retriving the data
				//iterate through all elements
				for(String s :ar) {
					System.out.print(" "+s);
				}
				
		//remove the data 
		ar.remove(2);
		System.out.println("\nData Removed:");
		System.out.println(" \n"+ar);
		
	}
}
