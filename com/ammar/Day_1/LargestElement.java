package com.ammar.Day_1;

import java.util.Scanner;
	
public class LargestElement {
	void LargestElementInArray(int arr[]) {
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>temp){
					temp=arr[i];
				}
		}
		System.out.println("Largest Element is :"+temp);
	}
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" element:");
			arr[i]=input.nextInt();
		}
		LargestElement le = new LargestElement();
		le.LargestElementInArray(arr);

}
}

