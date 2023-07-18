package com.tm.constant;

public interface Constant {

//	status codes start
	public static final int OK = 200;
	public static final int CREATED = 201;
	public static final int BAD_REQUEST = 400;
	public static final int UNAUTHORIZED = 401;
	public static final int FORBIDDEN = 403;
	public static final int NOT_FOUND = 404;
	public static final int INTERNAL_SERVER_ERROR = 500;
	public static final int CONFLICT = 409;
//	status codes end
	
	public static final String REQUIRED_PARAMETER_MISSING = "Required parameter missing";

}
