package pattern;

public class PrintStar {
	public static void main(String[] args) {
		int line =4;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	System.out.println("-------------------");
		for(int i=line;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		System.out.println("-------------------");
		for(int i=line;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
	}
	

}
