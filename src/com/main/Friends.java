package com.main;
import com.main.User;
public class Friends extends User{
	
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String address;
	private String dob;

	public Friends(String firstName, String lastName, String contactNumber, String address, String dob)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.dob = dob;
	}
	

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setContact(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getContact()
	{
		return contactNumber;
	}
	public String getAddress()
	{
		return address;
	}
	public String getDob()
	{
		return dob;
	}
}