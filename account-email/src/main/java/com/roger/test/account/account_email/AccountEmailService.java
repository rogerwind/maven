package com.roger.test.account.account_email;

public interface AccountEmailService{
	public void sendMail(String to,String subject,String htmlText) throws AccountEmailException;
}
