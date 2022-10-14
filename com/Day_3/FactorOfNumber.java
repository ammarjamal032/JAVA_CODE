package com.Day_3;
import java.util.Scanner;
public class FactorOfNumber {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The NUmber :");
		int num = input.nextInt();
		System.out.println("Factors are..");
		for(int i=1; i<=num;i++) {
			if(num % i==0) {
				System.out.print(" "+i);
			}
		}
	}
}
