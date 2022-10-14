package Array;
import java.util.Scanner;
public class CopyArray {
	void OriganalArray(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i] );
		}
	}
	void CopyArr(int arr[],int size) {
		 int arrCopy[] = new int[size];
		 for(int i=0;i<size;i++) {
			 arrCopy[i]=arr[i];
		 }
		 System.out.println("\n\nCppied Array :");
		 for(int i=0;i<size;i++) {
			 System.out.print( " "+arrCopy[i]);
		 }
	}
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of array :");
		int size= input.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter elements :");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		new CopyArray().OriganalArray(arr, size);
		new CopyArray().CopyArr(arr, size);
	}
}
