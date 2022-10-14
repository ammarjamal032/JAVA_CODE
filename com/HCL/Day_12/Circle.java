package com.HCL.Day_12;

import java.util.Scanner;
final class Area{
	
}
public class Circle {
	 final static double p =  3.14;
	 double area(double r) {
		//p=9; if we change this value so compile time error will occur
		return p*r*r;
	}
	
	double circumference(double r) {
		return 2*p*r;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle circle = new Circle();
		try {
			
			System.out.println("Enter the radius :");
			double r= input.nextInt();
			
			System.out.println("Area of Circle :"+circle.area(r));
			
			System.out.println("Circumference of Circle :"+circle.circumference(r));
		}
		catch(Exception ex) {
			System.out.println("Error: Enter digit only");
		}
	}
}
