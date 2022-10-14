package ExceptionHandling;

public class NotEligableException extends Exception {
	NotEligableException(String msg){
		System.out.println(msg);
	}
}
