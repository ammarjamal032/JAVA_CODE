package com.ammar.Day_1;

import java.util.Scanner;

public class PerfectSq {
	static boolean isPerfect(int num) {
		double sq =Math.sqrt(num);
		if(sq%1 == 0) {
			return true;		
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = input.nextInt();
		if(isPerfect(number)) {
			System.out.println("Number is perfect square :");	
		}
		else {
			System.out.println("Number is not perfect square.");
		}
		input.close();
	}
}
