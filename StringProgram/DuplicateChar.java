package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateChar {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String :");
		String str = input.readLine();
		str = str.toLowerCase();
		char st[] = str.toCharArray();
		
		int count;		
		for(int i=0;i<st.length;i++) {
			count=1;
					for(int j=i+1;j<st.length;j++) {
						if(st[i]==st[j] && st[i]!=' ') {
							count++;
							st[j]=0;
						}
					
				}if(count > 1 && st[i] != '0')    
	                System.out.print(" "+st[i]);  
			}
		
	}
}
