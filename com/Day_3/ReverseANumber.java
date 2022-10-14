package com.Day_3;
import java.util.*;
public class ReverseANumber {
	public static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
		int f=0;
		System.out.println("Enter a number :");
		int num =input.nextInt();
		while(num!=0) {
			int r=num%10;
			f= (f*10)+r;
			num/=10;
			
		}
		System.out.println("Reverse Number :"+f);
	}
}
