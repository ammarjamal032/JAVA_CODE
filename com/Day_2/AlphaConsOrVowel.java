package com.Day_2;
import java.util.*;
public class AlphaConsOrVowel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  a letter :");
		char ch = input.next().charAt(0);
		
		if (ch =='a' || ch == 'i' || ch == 'o' ||  ch == 'u' ||  ch == 'v' ||ch =='A' || ch == 'I' || ch == 'O' ||  ch == 'U' ||  ch == 'V' ) {
			System.out.println("Alphabet is vowel");
		}
		else {
			System.out.println("Alphabet is Constant");
		}
	}
}
