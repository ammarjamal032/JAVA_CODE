package com.ammar.Day_1;

import java.util.Scanner;

public class SumofAllElement {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		int sum=0;
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" element:");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i]);
			sum+=arr[i];
		}
	}
}