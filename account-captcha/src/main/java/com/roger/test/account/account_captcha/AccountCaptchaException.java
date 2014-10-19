package com.roger.test.account.account_captcha;

public class AccountCaptchaException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7045604925113256452L;

	public AccountCaptchaException( String message )
    {
        super( message );
    }

    public AccountCaptchaException( String message, Throwable throwable )
    {
        super( message, throwable );
    }
}
