package com.ammar.Day_1;

import java.util.*;

public class EvenPositionInArray {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" element:");
			arr[i]=input.nextInt();
		}

		System.out.println("Even Position :");
		for(int k=1;k<size;k+=2) {
			
				System.out.print(" "+arr[k]);
			
		}
		System.out.println("\nOdd Position :");
		for(int k=0;k<size;k+=2) {
			
				System.out.print(" "+arr[k]);
			
		}
	}
}

