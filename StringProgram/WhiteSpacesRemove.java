package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteSpacesRemove {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String :");
		String str = input.readLine();
		char st[] = str.toCharArray();
		
		String str1="";
		for(int i=0;i<st.length-1;i++) {
			if(st[i]!=' ') {
				str1 += st[i];
				}
			}
		System.out.println("String : " +str1);
	}
}
