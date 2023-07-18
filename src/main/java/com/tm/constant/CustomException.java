package com.tm.constant;

public class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Exception exception;

	public CustomException(String message, Exception exception) {
		super(message);
		this.setException(exception);
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

}
