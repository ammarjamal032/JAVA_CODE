package com.Day_1;
import java.util.Scanner;
public class Ascii_value {
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a single Charecter :");
		
		char ch = input.next().charAt(0);
		
		System.out.println("Your Charecter is :"+ch);
		
		int ascii_value=ch;
		
		System.out.println("ASCII value is :"+ascii_value);
		
		input.close();
	}
}
