package Number;
import java.util.*;
public class PrimeNumber {
	boolean isPrime(int num) {
		int i=2;
//		while(i<=num/2) {
//			if(num%i==0) {
//				return false;
//			}
//			else {
//				return true;
//			}
//		}
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
			else {
				return true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = input.nextInt();
		if(pn.isPrime(number)) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
	
