package com.roger.test.account.account_email;

public class AccountEmailException extends Exception{
	private static final long serialVersionUID = -4263370779726923176L;
	public AccountEmailException( String message )
    {
        super( message );
    }

    public AccountEmailException( String message, Throwable throwable )
    {
        super( message, throwable );
    }
}
