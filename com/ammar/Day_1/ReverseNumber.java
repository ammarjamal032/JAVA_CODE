package com.ammar.Day_1;
import java.util.*;

public class ReverseNumber {
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
	int n =arr.length;
	int[] temp = new int[n];
    int j = n;
    for (int i = 0; i < n; i++) {
        temp[j - 1] = arr[i];
        j = j - 1;
    }
    System.out.println("Reverse array \n");
    for(int k =0 ;k<n;k++) {
    	System.out.println(" "+temp[k]);
    }
}
}
