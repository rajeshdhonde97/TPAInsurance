package in.ashokit.exception;

public class PolicyNotFoundException extends RuntimeException{

	public PolicyNotFoundException(String errorMsg) {
		super(errorMsg);
	}

}
