package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceWhiteSapce {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String :");
		String str = input.readLine();
		System.out.println("Enter a char to replace White sapces:");
		char rpl = (char) input.read();
		char st[] = str.toCharArray();
		
		for(int i=0;i<st.length;i++) {
			if(st[i]== ' ') {
				st[i]=rpl;
				
			}
			System.out.print(st[i]);
		}
		
		
		
		
	}
}
