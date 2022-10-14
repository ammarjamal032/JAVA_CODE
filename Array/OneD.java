package Array;


import java.util.Scanner;
public class OneD {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
	Scanner input = new Scanner(System.in);
	try {
//		System.out.println("Enter of the length of array : ");
//		int l= input.nextInt();
		int arr[] = new int[5];
		System.out.println("Enter the elements of Array :");
		for(int i =0;i<6;i++) {
			arr[i]=input.nextInt();
		}
		 Integer arr1[] = new Integer[5];
		for(int i:arr) {
			
				System.out.print(i+", ");
			
			
		}
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex);
	}
	
	
}
}
