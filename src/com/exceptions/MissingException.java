package com.exceptions;
import java.lang.Exception;


public class MissingException extends Exception//username not start with special character
{
	public MissingException(String s)
	{
		super(s);
	}
}