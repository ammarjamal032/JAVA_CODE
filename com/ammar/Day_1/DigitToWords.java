package com.ammar.Day_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitToWords {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number (1 to 99):");
		int number = Integer.parseInt(input.readLine());
		int lastDigit = number%10;
		int firstDigit = number/10;
//		System.out.println("First digit :"+firstDigit);
//		System.out.println("last digit :"+lastDigit);
		if(number>=100) {
			System.out.println("Enter nummber between 1-99.");
		}
		else {
			String ot[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
					"Eleven","Tawel","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
			String th[] = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			if(number > 0 && number <=9 ) {
				System.out.println(ot[lastDigit]);
			}
			else if(number>=10 && number <=19) {
				System.out.println(ot[10+lastDigit]);
			}
			else if (number >=20 && number <=99) {
				System.out.println(th[firstDigit]+" "+ot[lastDigit]);
			}
		}
		
	}
}
