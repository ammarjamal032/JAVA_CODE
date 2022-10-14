package com.Day_2;
import java.util.*;
public class LCM {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter First number :");
		int num1 = input.nextInt();
		System.out.println("Enter IInd Number :");
		int num2 = input.nextInt();
		int gcd =1;
		
		for(int i=1; i<=num1 && i<=num2 ; ++i) {
			if(num1 %i==0 && num2 %i==0) {
				gcd=i;
			}	
		}
		int lcm = (num1* num2)/gcd;
		System.out.println("LCM of "+num1+" & "+num2+" is  : "+lcm);
	}
}
