package Number;
import java.util.Scanner;
public class FibanocciSeries {
	static void series(int num) {
		int num1=0,num2=1,num3;
		System.out.print(num1+" "+num2);
		//0 1 1 2 3 5 8 13.......
		for(int i=2;i<=num;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
		
	}
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number :");
	int num = input.nextInt();
	series(num);
	
}
}
