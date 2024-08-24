package in.ashokit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PolicyHandlerException {
	
	@ExceptionHandler(value= {PolicyNotFoundException.class})
	public ResponseEntity<Object> handlePolicy(PolicyNotFoundException policyNotFoundException){
		PolicyExceptions policyExceptions=new PolicyExceptions(policyNotFoundException.getMessage(), policyNotFoundException.getCause(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(policyExceptions,HttpStatus.NOT_FOUND);
	}

}
