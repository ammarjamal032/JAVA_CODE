package com.ammar.Day_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
	static int fact(int f) {
		int i=1;
		 int fct=1;
		while(i<=f) {
			fct = fct*i;
			i++;
		}
		return fct;
	}
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
	
	System.out.println("Enter A number :");
	try {
		int num = Integer.parseInt(input.readLine());
		System.out.println("Fafctorial :"+fact(num));
	} 
	catch (NumberFormatException e) {
		System.out.println(e);
		e.printStackTrace();
	} 
	}
}
