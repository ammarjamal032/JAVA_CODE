package com.ammar.Day_1;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FindElement {

	void arrayD(int arr[], int f) {
		for(int i=0; i<arr.length;i++) 
			{
				if(arr[i]==f) {
					System.out.print("Element "+ f+" is at index : "+i);
				}
			
		
			}
		}
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		FindElement ar = new FindElement();
		
			System.out.println("Enter the size of array :");
			int size = Integer.parseInt(in.readLine());
			int arr[] = new int[size];
			System.out.println("Enter the element of Array :");
			for(int i=0;i<size;i++) {
				arr[i] = Integer.parseInt(in.readLine());
			}
			System.out.println("Enter the element to find :");
			int f = Integer.parseInt(in.readLine());
			ar.arrayD(arr,f);
		
		
		
		
		
		
	}
}
