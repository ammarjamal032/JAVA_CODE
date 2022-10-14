package Number;

import java.util.Scanner;

public class Factorial {
	static void Fact(int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		//int i=1;
//		while(i<=num) {
//			fact *= i;
//			i++;
//		}
		System.out.println(" Factorial of "+num+" is :"+fact);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = input.nextInt();
		Fact(number);
	}
}
