package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet {

	public static void main(String args[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the size of list:");
			int size = input.nextInt();

			for (int i = 1; i <= size; i++) {
				System.out.println("Enter the " + i + " element :");
				set.add(input.nextInt());
			}
			input.close();

			System.out.println("List:-----");
			Iterator<Integer> i = set.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
			}
		} catch (Exception e) {
			System.out.println("Enter Integer Only. " + e);
		}

	}
}