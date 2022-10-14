package StringProgram;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = input.nextLine();
		int l = str.length();
		char st[]=str.toCharArray();
		String rev="";
		int count =0;
		for(int i = st.length-1;i>=0;i--) {
			rev +=st[i];
			if(st[i]== ' ') {
				count++;
			}
			
		}
		System.out.println(rev);
		System.out.println("Cahracter in string :"+(l-count));
	}
}
