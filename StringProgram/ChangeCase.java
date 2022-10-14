package StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeCase {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String :");
		String str = input.readLine();
		System.out.println("1.Upper Case\n2.Lower Case.");
		int ch = Integer.parseInt(input.readLine());
		switch(ch) {
		case 1:
			System.out.println(str.toUpperCase());
			break;
		case 2:
			System.out.println(str.toLowerCase());
		}
		
		
	}
}
