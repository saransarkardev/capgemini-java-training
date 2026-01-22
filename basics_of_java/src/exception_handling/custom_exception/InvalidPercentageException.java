package exception_handling.custom_exception;

public class InvalidPercentageException extends RuntimeException{
	
	public InvalidPercentageException(String msg) {
		super(msg);
	}
}
