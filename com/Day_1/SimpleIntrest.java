package com.Day_1;
import java.util.*;
public class SimpleIntrest {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Principal Amount: ");
			double pa = input.nextDouble();
			System.out.println("Enter the Rate: ");
			double rate =input.nextDouble();
			System.out.println("Enter the year: ");
			double time = input.nextDouble();
			
			double total = (pa*rate*time)/100;
			System.out.println("Simple Interest is :"+total);
		}
}
