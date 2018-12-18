package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.util.Date;

/*
 * this is a generic exception handling for all resources
 */
public class ExceptionResponse {
	private Date timestamp;//cand s-a produs exceptia
	private String message;
	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
