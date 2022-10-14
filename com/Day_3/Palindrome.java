package com.Day_3;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,sum=0,rem;
		System.out.println("ENter a number :");
		int oNum= input.nextInt();
		num=oNum;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(oNum==sum) {
			System.out.println("Number is Palindrome..");
		}
		else {
			System.out.println("Number is not Palindrome..");
		}
	}
}
