package com.processor;
import java.util.Scanner;
import com.main.User;
import com.main.Friends;
import com.processor.CreateUser;
import com.processor.JavaApplication1;
import java.util.Scanner;
import java.util.ArrayList;
import com.main.*;
import com.processor.Login;
import java.lang.Exception;
import java.util.Iterator;
public class LoginUser extends Login
{
	
	public void read()
	{
		JavaApplication1 read = new JavaApplication1();
		read.readfriends();

	}
	public void menu()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("=====================================================================================================================");
		System.out.println("===========================================Successfully Logged in...=================================================");
		System.out.println("=====================================================================================================================");
		System.out.println("                                                OPERATION MENU                                                       ");
		System.out.println("=====================================================================================================================");
		System.out.println("\t 1.Add Friend");
		System.out.println("\t 2.Remove Friend");
		System.out.println("\t 3.Show Friends");
		System.out.println("\t 0.Enter 0 to log out");
		ArrayList<Friends> newfriend = new ArrayList<Friends>();
		System.out.print("\t Enter your choice: ");
		int n = s.nextInt();
		String fname,lname,address,contact,dob;
		CreateUser user = new CreateUser();
		
		switch(n)
		{
			case 1: System.out.print("\t\t\tEnter first name: ");
					fname= s.next();
					System.out.print("\t\t\tEnter last name: ");
					lname = s.next();
					System.out.print("\t\t\tEnter Address: ");
					address = s.next();
					System.out.print("\t\t\tEnter Contact: ");
					contact = s.next();
					System.out.print("\t\t\tEnter Date of Birth: ");
					dob=s.next();
					Friends f = new Friends(fname,lname,contact,address,dob);
					newfriend.add(f);
					newfriend.addAll(friend);
					break;
			case 2:	try{
					System.out.println("Enter Friend name want to remove: ");
					int i = s.nextInt();
					newfriend.remove(i);
					break;
					}catch(Exception e)
					{
						System.out.println(e);
						
					}

			case 3:  Iterator<Friends> it = newfriend.iterator();
    				 while(it.hasNext())
    				 {

        					System.out.println(it.next());
  					 }
					break;
			case 0: break;
		}
	}
}