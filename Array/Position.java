package Array;

import java.util.Scanner;
	
public class Position {
void evenPosition(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(" "+arr[i]);
			}
		}
	}

void oddPosition(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.print(" "+arr[i]);
		}
	}
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Position position = new Position();
		System.out.println("Enter the size of array :");
		int size = input.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size;i++) {
			arr[i]=input.nextInt();
		}
		
		System.out.println("Origanal Values :");
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("\nEven Postion");
		position.evenPosition(arr);
		System.out.println("\nOdd Position");
		position.oddPosition(arr);
	}
}
