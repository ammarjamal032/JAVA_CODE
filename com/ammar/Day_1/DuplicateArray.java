package com.ammar.Day_1;
import java.util.*;

public class DuplicateArray {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
//	for(int i =0;i<arr.length;i++) 
//	{
//		System.out.println(" "+arr[i]);
//	}
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(" "+arr[i]);
					//count++;
				}
			}
		}
		//System.out.println(count);
	}
}

