package com.ammar.Day_1;

import java.util.*;

public class OddEven {
public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);
	System.out.println("Enter the size :");
	int size = Input.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the element :");
	for(int i=0;i<size;i++) {
		arr[i] = Input.nextInt();
	}
	System.out.println("Entered Array.");
	for(int i =0;i<size;i++) 
	{
		System.out.println(" "+arr[i]);
	}
	System.out.println("Even Numbers:");
	for(int i =0;i<size;i++) 
	{
		if(arr[i]%2==0) {
			System.out.println(" "+arr[i]);	
		}
		
	}
	System.out.println("Odd Numbers:");
	for(int i =0;i<size;i++) 
	{
		if(arr[i]%2!=0) {
			System.out.println(" "+arr[i]);	
		}
		
	}
	
    
    

}
}
