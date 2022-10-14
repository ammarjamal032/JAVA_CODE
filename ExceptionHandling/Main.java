package ExceptionHandling;
import java.util.*;
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.print("Enter the age :");
			int age = input.nextInt();
			vote(age);
		} 
		catch (NotEligableException e) {}
		catch(InputMismatchException e) {
			System.out.println("Enter a number only.");
		}
		finally {
			input.close();
		}
	}
	static void vote(int age ) throws NotEligableException {
		if(age<18) {
			throw new NotEligableException("You are not Eligable.");
		}
		else {
			System.out.println("You are Eligable.");
		}
	}
}
