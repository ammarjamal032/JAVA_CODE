package Array;

import java.util.Scanner;

public class DuplicateArrayElement {
	
	//sorting
	void sort(int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(" "+arr[i]);
			}
		}
		
	}
	//operation
	void duplicate(int arr[],int size) {
		
		int count=0;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
					
					count++;
				}
			}
		}
		
		for(int i =0; i<size;i++) {
			if(arr[i]!=0) {
				System.out.println(" "+arr[i]);
			}
			
		}
		System.out.println("Total duplicate number : "+count);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DuplicateArrayElement duplicateArrayElement = new DuplicateArrayElement();
		try {
			System.out.println("Enter the size of array:");
			int size = input.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the elements: ");
			for (int i = 0; i < size; i++) {
				arr[i] = input.nextInt();
			}

			System.out.println("Orignal Array: ");
			for (int i : arr) {
				System.out.print(" " + i);
			}
			System.out.println("\nAfter removing duplicate values :");
			duplicateArrayElement.duplicate(arr, size);
			//System.out.println("Sorting");
			//duplicateArrayElement.sort(arr);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		} finally {
			input.close();
		}

	}
}
