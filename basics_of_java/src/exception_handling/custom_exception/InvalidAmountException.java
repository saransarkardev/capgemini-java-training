package exception_handling.custom_exception;

public class InvalidAmountException extends Exception{
	
	public InvalidAmountException(String msg) {
		super(msg);
	}
}
