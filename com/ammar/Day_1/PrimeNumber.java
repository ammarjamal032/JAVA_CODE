package com.ammar.Day_1;

import java.util.Scanner;

public class PrimeNumber {
	  public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to check prime or not :");
		int p = input.nextInt();
		if(isPrime(p)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
}
