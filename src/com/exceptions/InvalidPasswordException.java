package com.exceptions;
import java.lang.Exception;


public class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String s)
	{
		super(s);
	}
}