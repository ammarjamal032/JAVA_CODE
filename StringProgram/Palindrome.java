package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome  {
	static void print(boolean b) {
		if(b) {
			System.out.println("Given string is palindrome ");
		}
		else {
			System.out.println("Given string is not palindrome ");
		}
	}
	static boolean m1 (String str) {
		char st[] = str.toCharArray();
		
		for(int i=0;i<st.length-1;i++) {
			for(int j=st.length-1;j>0;) {
				if(st[i]== st[j]) {
					return true;
					
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException  {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String :");
		String str = input.readLine();
		str=str.toUpperCase();
		print(m1(str));		
		
		
		
		
		
	}
}
