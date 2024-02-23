package com.ex.controller.response;

public class ErrorResponse {
	private String errorMessgae;

	public String getErrorMessgae() {
		return errorMessgae;
	}

	public void setErrorMessgae(String errorMessgae) {
		this.errorMessgae = errorMessgae;
	}

	public ErrorResponse(String errorMessgae) {
		super();
		this.errorMessgae = errorMessgae;
	}
}
