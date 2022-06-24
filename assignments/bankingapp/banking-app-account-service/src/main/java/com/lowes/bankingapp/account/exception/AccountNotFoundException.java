package com.lowes.bankingapp.account.exception;

public class AccountNotFoundException extends AccountServiceException {
	public AccountNotFoundException() {
		super("Requested entity not present in the DB." + GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
	}

	public AccountNotFoundException(String message) {
		super(message + GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
	}
}
