package com.exceptions;
import java.lang.Exception;


public class SpecialCharacterException extends Exception//username not start with special character
{
	public SpecialCharacterException(String s)
	{
		super(s);
	}
}