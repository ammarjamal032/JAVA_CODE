package com.ammar.Day_1;

import java.util.*;

public class ArrayInReverseOrder {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" element:");
			arr[i]=input.nextInt();
		}

		System.out.println("Orignal Array :");
		for(int k=0;k<size;k++) {
			System.out.print(" "+arr[k]);
		}
		System.out.println("\nReverse Array :");
		for(int j=size-1;j>=0;j--) {
			System.out.print( " "+arr[j]);
		}
	}
}

