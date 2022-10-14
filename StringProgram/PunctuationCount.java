package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PunctuationCount {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String :");
		String str = input.readLine();
		char st[] = str.toCharArray();
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(st[i]== ',' || st[i]=='.') {
				count++;
			}
			
		}
		System.out.println("Punctuation are :"+count);
	}

}
