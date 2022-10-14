package com.Day_2;
import java.util.*;
import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Ist number :");
		int num = input.nextInt();
		System.out.println("Enter IInd number");
		int num1 = input.nextInt();
		if(num>num1) {
			System.out.println(num+" is Greater than "+num1+". Biggest number is :"+num);
		}
		else {
			System.out.println(num+" is lesser than "+num1+". Biggest number is :"+num1);
		}
	}
}
