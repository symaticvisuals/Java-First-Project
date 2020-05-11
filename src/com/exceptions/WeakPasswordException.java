package com.exceptions;
import java.lang.Exception;


public class WeakPasswordException extends Exception{
	public WeakPasswordException(String s)
	{
		super(s);
	}
}