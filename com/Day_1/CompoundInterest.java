package com.Day_1;
import java.util.*;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		double pa = input.nextDouble();
		System.out.println("Enter the Rate: ");
		double rate =input.nextDouble();
		System.out.println("Enter the year: ");
		double time = input.nextDouble();
		double total = pa *(Math.pow(1+rate/100, time))-pa;
		System.out.println("Compound interest :"+total);
		
	}
	
}
