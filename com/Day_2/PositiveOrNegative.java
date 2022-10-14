package com.Day_2;
import java.util.*;
public class PositiveOrNegative {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		int num = input.nextInt();
		if(num>0) {
			System.out.println("Number is +ve");
		}
		else {
			System.out.println("Number is -ve");
		}
	}
}
