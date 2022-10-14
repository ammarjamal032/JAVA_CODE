package com.ammar.Day_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PeterSon {
	
	static int fact(int f) {
		int i=1;
		 int fct=1;
		while(i<=f) {
			fct = fct*i;
			i++;
		}
		return fct;
	}
	static boolean isPeterSon(int num) {
		int num1=num;
		int sum =0;
		while(num>0) {
			int lastDigit = num%10;
			sum = sum+fact(lastDigit);
			num=num/10;
		}
		return (sum==num1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String ch;
		do {
			System.out.println("Enter a number :");
			int number = Integer.parseInt(input.readLine());
			if(isPeterSon(number)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			System.out.println("Do you want to continue (Y/y):");
			ch =input.readLine();
			
		}
		while(ch=="Y"|| ch=="y");
		
		
	}
}
