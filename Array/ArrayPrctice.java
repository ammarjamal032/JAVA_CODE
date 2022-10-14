package Array;
import java.util.*;
public class ArrayPrctice {
		void IIndSmallest(int arr[],int size) {
			int temp=0;
			for(int i=0;i<size-1;i++) {
				for(int j=i+1; j<size;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			for(int i=0;i<size;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println("\nIInd Smallest Number :"+arr[1]);
		}
	
		public static void main(String[] args) {
			ArrayPrctice Ap = new ArrayPrctice();
			Scanner input= new Scanner(System.in);
			System.out.println("Enter the size of array :");
			int size = input.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the elements :");
			for(int i=0;i<size;i++) {
				arr[i]=input.nextInt();
			}
			Ap.IIndSmallest(arr,size);
			
		}
}
