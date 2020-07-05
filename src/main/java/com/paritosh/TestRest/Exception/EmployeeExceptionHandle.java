package com.paritosh.TestRest.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeExceptionHandle extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeExceptionHandle(String message) {
		super(message);
		
	}
    
}
