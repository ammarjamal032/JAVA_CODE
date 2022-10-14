package com.Day_2;
import java.util.*;
public class SumOfTwoNumber {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Ist Number :");
		double num1=input.nextDouble();
		int n1 = (int)num1;
		
		System.out.println("Enter IInd Number :");
		double num2=input.nextDouble();
		int n2 = (int)num2;
		
		if(n1+n2>=50) {
			System.out.println("Sum of above Number= "+(n1+n2)+" is greater than 50\nHCL");
		}
		else {
			System.out.println("Sum of above Number= "+(n1+n2)+" is less than 50\nHCL Technologies Pvt Ltd.");
		}
	}
}
