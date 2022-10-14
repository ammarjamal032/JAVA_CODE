package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortOfString {
	
	void sorting(String str) {
		char st[]= str.toCharArray();
		Arrays.sort(st);
		System.out.println(String.valueOf(st));
	}
	public static void main(String[] args) throws IOException  {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String :");
		String str = input.readLine();
		new SortOfString().sorting(str);
		
}
}
