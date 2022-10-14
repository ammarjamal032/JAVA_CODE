package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Enter first String :");
		String str = input.readLine();
		System.out.println("Enter Second String :");
		String str1 = input.readLine();
		int count =0;
		if(str.length()==str1.length()) {
			char st[]= str.toCharArray();
			char st1[]= str1.toCharArray();
			Arrays.sort(st);
			Arrays.sort(st1);
			
			
			for(int i=0; i<str.length();i++) {
				for(int j=0;j<str1.length();j++) {
					if(st[i]==st1[j]) {
						count =1;
					}
					else {
						count =0;
					}
				}
			}
			if(count ==1) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
				
			}
		}
	}
}
