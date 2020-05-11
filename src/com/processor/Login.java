package com.processor;
import java.util.Scanner;
import java.util.Scanner;
import com.main.User;
import java.util.ArrayList;
import com.validator.UserValidator;
import com.processor.CreateUser;
import com.main.*;
import com.processor.LoginUser;
import java.io.*;
public class Login
{
	String username;
	String pass;
	public ArrayList<Friends> friend= new ArrayList<Friends>();
	
	public void setusername(String username)
	{
		this.username = username;
	}
	public void setpassword(String password)
	{
		this.pass = password;
	}
	public  void   getuser()                // Method to Create New Account
	{
		Scanner s = new Scanner(System.in);
		User U1 = new User ();
		System.out.print("\t\t\tEnter Username: ");
		String user = s.next();
		
		U1.setuser(user);
		System.out.print("\t\t\tEnter New Password: ");
		String password = s.next();
		System.out.print("\t\t\tConfirm Password: ");
		String password1 = s.next();

			
			UserValidator validator = new UserValidator();

			if(password.equals(password1))
			{
				setusername(user);
				setpassword(password1);
				U1.setpassword(password);
				validator.nameValidator(user,password);
				CreateUser cr = new CreateUser();
				cr.create(U1.getusername(),U1.getpassword());


			}
			else
			{
				System.out.println("\t\t\tYour password doesnt match");
			}
		
		

	}

	
	public  void loginscreen()   // Method to Login to the Server
	{
		
		LoginUser login = new LoginUser();
		login.menu();
	}
	public   void case1()
	{
				Scanner s = new Scanner (System.in);
				System.out.print("\t\t\tEnter Username: ");
				String name = s.next();
				System.out.print("\t\t\tEnter Password: ");
				String password = s.next();
				
				if(username.equals(name)&&password.equals(pass))
				{
					loginscreen();
				}
				else 
				{
					System.out.println("Your Password is Incorrect");
					System.out.println("Enter 0 to exit Enter 1 to retry");
					int ch = s.nextInt();
					switch(ch){
					case 1: break;
					
					case 2:case1();
					break;
				}

				}
	}
	
}

	
