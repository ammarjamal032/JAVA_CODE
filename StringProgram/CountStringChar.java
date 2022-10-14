package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountStringChar {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	void NumberOfChar(String s) {
		char s1[] =s.toCharArray();
		int l = s1.length;
		int count=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i] ==' ') {
				count++;
			}
		}
		System.out.println("Total number of charecter is :"+(l-count));
	}
	public static void main(String[] args) throws Exception {
		CountStringChar csc = new CountStringChar();
		System.out.println("Enter a string :");
		String s =  input.readLine();
		csc.NumberOfChar(s);
	}
}
