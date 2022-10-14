package Array;

import java.util.Scanner;

public class DupllicateElement {
	void operation(int arr[], int size) {
		int display = 0;
		int visited[] = new int[size];

		for (int i = 0; i < arr.length - 1; i++) {
			if (visited[i] == 1) {
				continue;
			}
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					visited[j] = 1;
					++count;
					break;
				}
			}
			if ((count > 0) && (display < size)) {
				++display;
				System.out.println("Repeating element =" + arr[i]);
			}
			
		}
		System.out.println("After Removing Duplicate value :");
		for(int i=0;i<size;i++) {
			if(arr[i]!=0) {
				System.out.println(" "+arr[i]);
			}
		}

	}

	void printRepeating(int arr[], int size) {
		int count[] = new int[size];
		int i;

		System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				count[i]=0;
			else
				count[arr[i]]++;
		}
		System.out.println("Filtered are :");
		for(int j=0;j<size;j++) {
			if(count[j]!=0) {
				System.out.println(" "+count[j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DupllicateElement dupllicateElement = new DupllicateElement();
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
			System.out.println("\nDuplicate Value :");
			//dupllicateElement.operation(arr, size);
			 dupllicateElement.printRepeating(arr,size);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		} finally {
			input.close();
		}

	}
}

//
//
//it will not work for more than two occurrence of any number. there is good and effective solution here.
//
////C++ program to Find the two repeating
////elements in a given array
//#include<bits stdc++.h="">
//using namespace std;
//
//void printTwoRepeatNumber(int arr[], int size)
//{
//int i, j, display=0;
//int visited[size];
//for(i = 0; i < size; i++)
//{
//if (visited[i] == 1)
//{
//continue;
//}
//int count = 0;
//for(j = i + 1; j < size; j++)
//{
//if(arr[i] == arr[j])
//{
//visited[j] = 1;
//++count;
//break;
//}
//}
//if ( (count > 0) && (display < 2)){
//++display;
//
//cout<<"repeating element = "<< arr[i]<<endl; 
//}="" }="" }="" int="" main()="" {="" int="" 
//arr[]="{4," 2,="" 5,="" 2,="" 3,="" 3,="" 4,="" 4,="" 1,="" 1};="" 
//int="" arr_size="sizeof(arr)/sizeof(arr[0]);" 
//printtworepeatnumber(arr,="" arr_size);="" }="">





