package com.roger.test.account.account_service;

public class AccountServiceException extends Exception {
	private static final long serialVersionUID = 5526181070284911924L;

	public AccountServiceException(String message) {
		super(message);
	}

	public AccountServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
