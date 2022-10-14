package com.ammar.Day_1;

import java.util.Scanner;

public class NaturalNumber {
	int sumOfNatural(int number) {
		int sum =0;
		for(int i=1;i<=number;i++) {
			sum +=i;
		}
		return sum;
	}
	int sumOfNatural1(int number) {
		int sum =0,i=1;
		while(i<=number) {
		sum +=i;
		i++;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NaturalNumber nNum =new NaturalNumber();
		System.out.println("Enter the number to get sum of natural numbers:");
		int number=input.nextInt();
		System.out.println("Sum of "+nNum.sumOfNatural(number));
		System.out.println("Sum of "+nNum.sumOfNatural1(number));
	}
}
