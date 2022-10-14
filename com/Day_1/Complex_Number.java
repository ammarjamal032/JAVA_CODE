package com.Day_1;
import java.util.Scanner;
public class Complex_Number {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//method 1; without using scanner class;
		int real_num1=3;
		int imag_num1 =5;
		System.out.println("Our First Complex Number is :"+real_num1+" + "+imag_num1+"i");
		int real_num2=4;
		int imag_num2 =6;
		System.out.println("Our Second Complex Number is :"+real_num2+" + "+imag_num2+"i");
		int sumOfReal = real_num1+real_num2;
		int sumOfImag	= imag_num1+imag_num2;
		System.out.println("Addition of Complex number is : "+sumOfReal+" + "+sumOfImag+"i");
		
		
		//Using Scanner Class.
		System.out.println("Using Scanner Class.");
		System.out.println("Enter your First Complex Real Number :");
		int realNum1=input.nextInt();
		System.out.println("Enter your First Complex Imaginary number :");
		int imagNum1=input.nextInt();
		System.out.println("Enter your Second Complex Real Number :");
		int realNum2=input.nextInt();
		System.out.println("Enter your Second Complex Imaginary number :");
		int imagNum2=input.nextInt();
		
		//formulae for adding complex number (a + ib) + (c + id) = (a + c) + (b + d)i.
		System.out.println("Addition of Complex number is :"+(realNum1+realNum2)+" + "+(imagNum1+imagNum2)+"i");
		
		
		
	}
}
