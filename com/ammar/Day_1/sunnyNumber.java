package com.ammar.Day_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sunnyNumber {
	static boolean isSunny(int num) {
		num =num+1;
		double sq = Math.sqrt(num);
		if(sq%1==0) {
			return true;	
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader input =new BufferedReader(new InputStreamReader(System.in) );
		String ch;
		do{
			System.out.println("Enter a number :");
			int number = Integer.parseInt(input.readLine());
			if(isSunny(number)) {
				System.out.println("Given number is Sunny Number.");
				
			}
			else {
				System.out.println("Given number is not a sunny number.");
			}
			System.out.println("Do you want to continue:");
			ch=input.readLine();
		}while(ch=="y" || ch =="Y");
		
	}

}
