package com.mishow.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserException extends Exception {
	Log log = LogFactory.getLog(UserException.class);
	private static final long serialVersionUID = 1L;

	public UserException(String message) {
		super(message);
	}

	public UserException(String message, String logStr) {
		super(message);
		log.error(logStr);
	}

	public UserException(String message, String logStr, Throwable e) {
		super(message);
		log.error(logStr, e);
	}

	public UserException(String message, Throwable e) {
		super(message);
		log.error(e);
	}
}
