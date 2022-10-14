package Array;
import java.util.Scanner;
public class TwoDimensnal {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the row of Array :");
		int row = input.nextInt();
		System.out.println("Enter the column of Array :");
		int col = input.nextInt();
		
		int arr[][] = new int [row][col];
		System.out.println("Enter the elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		
		System.out.println("orignal Array is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
