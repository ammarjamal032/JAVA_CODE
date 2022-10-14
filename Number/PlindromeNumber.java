package Number;
import java.util.Scanner;
public class PlindromeNumber {
	static boolean isPalindrome(int num){
		int rem,res=0;
		int Onum=num;
		if(num<=9) {
			return true;
		}
		else {
			while(num>0) {
				rem =num%10;
				res=(res*10)+rem;
				num=num/10;
			}
			if(Onum==res) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		if(isPalindrome(number)) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		
	}
}
