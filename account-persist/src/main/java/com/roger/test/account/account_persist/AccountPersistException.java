package com.roger.test.account.account_persist;

public class AccountPersistException extends Exception{
	private static final long serialVersionUID = -6774505910233361910L;

	public AccountPersistException( String message )
    {
        super( message );
    }

    public AccountPersistException( String message, Throwable throwable )
    {
        super( message, throwable );
    }
}
