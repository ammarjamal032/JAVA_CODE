package com.ammar.Day_1;


import java.util.Scanner;
	
public class SmallestElement {
	void SmallestElementInArray(int arr[]) {
		int temp=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]<temp){
					temp=arr[i];
				}
		}
		System.out.println("Smallest Element is :"+temp);
	}
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		int count=0;
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" element:");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i]);
			count++;
		}
		System.out.println("\nTotal number of element :"+count);
		SmallestElement le = new SmallestElement();
		le.SmallestElementInArray(arr);

}
}


