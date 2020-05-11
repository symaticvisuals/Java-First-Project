package com.main;
public class User{
	
	private String username;
	private String password;

	public User()
	{
		username= null;
		password= null;
	}
	public User(String username, String password)
	{
		this.username= username;
		this.password= password;
	}
	public void setuser(String username)
	{
		this.username = username;
	}
	public void setpassword(String password)
	{
		this.password = password;
	}
	public String getusername()
	{
		return this.username;
	}
	public String getpassword()
	{
		return this.password;
	}
	

}