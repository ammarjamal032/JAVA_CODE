package com.ammar.Day_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String pan(int num) {
		int rem,res=0;
		int oNum=num;
		while(num>0)
		{
		rem =num%10;
		res = (res*10)+rem;
		num = num/10;
		}
		if(oNum == res) {
			return "Given number is Palindrome";
		}
		else {
			return "Given number is not Palindrome";
		}
	}
	public static void main(String[] args) throws Exception{
		System.out.println("Enter a number : ");
		int num = Integer.parseInt(input.readLine());
		System.out.println(pan(num));
	}
}
