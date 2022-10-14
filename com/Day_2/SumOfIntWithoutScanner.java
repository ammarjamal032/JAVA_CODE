package com.Day_2;
import java.util.*;
public class SumOfIntWithoutScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter some integers:(After Integer type 'y') ");
		int sum = 0;
		while (s.hasNextInt()) {
		    sum += s.nextInt();
		    
		}
		System.out.println(" Sum = " + sum);
	}
	
}
