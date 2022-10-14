package Array;
import java.util.*;
public class AscendingAndDescending {
		static void ascending(int arr[]) {
			int temp =0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					 if(arr[i] > arr[j]) {    
		                   temp = arr[i];    
		                   arr[i] = arr[j];    
		                   arr[j] = temp;    
		               }  
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println("\n\nSecond smallest Number is :"+arr[1]);
		}
		
		static void dscending(int arr[]) {
			int temp =0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					 if(arr[i] < arr[j]) {    
		                   temp = arr[i];    
		                   arr[i] = arr[j];    
		                   arr[j] = temp;    
		               }  
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println("\n\nSecond largest Number is :"+arr[1]);
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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
		System.out.println("\nAscending Order.");
		ascending(arr);
		System.out.println("\nDscending Order.");
		dscending(arr);
	}
}
