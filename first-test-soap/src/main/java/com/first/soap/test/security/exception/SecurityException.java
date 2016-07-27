package com.first.soap.test.security.exception;

import javax.xml.ws.WebFault;

@WebFault
public class SecurityException extends Exception {

	private static final long serialVersionUID = 1L;

	public SecurityException(String message) {
		super(message);
	}
	
	public String getFaultInfo() {
        return "Token isn't valid !";
    }
	

}
