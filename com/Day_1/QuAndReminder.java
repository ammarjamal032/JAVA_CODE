package com.Day_1;
import java.util.*;
public class QuAndReminder {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number :");
	int num1= input.nextInt();
	System.out.println("Enter the IInd Number (should be less then first number.):");
	int num2 = input.nextInt();
	
	System.out.println("Quotient of "+num1+" and "+num2+" is :"+ (num1/num2));
	System.out.println("Reminder of "+num1+" and "+num2+" is :"+ (num1%num2));
}
}
