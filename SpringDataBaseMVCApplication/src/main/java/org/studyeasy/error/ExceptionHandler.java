package org.studyeasy.error;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public String errorOccured(Exception ex)
	{
		return "error";
	}
}
