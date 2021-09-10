package excetionQuiz01;

import oracle.jrockit.jfr.jdkevents.ThrowableTracer;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}
