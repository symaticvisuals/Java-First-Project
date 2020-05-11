package com.exceptions;
import java.lang.Exception;


public class InvalidMailException extends Exception
{
	public InvalidMailException (String s)
	{
		super(s);
	}
}