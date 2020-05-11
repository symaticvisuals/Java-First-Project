package com.processor;
import com.main.*;
import org.json.simple.JSONObject;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.validator.UserValidator;
import java.io.*;
import java.lang.Object; // regarding json objects 
import java.util.Scanner;
import com.google.gson.Gson; // Use to take list from user and write into file
import com.google.gson.GsonBuilder;  //
import com.processor.LoginUser;  


public class CreateUser extends LoginUser
{
	
	
	public void userwrite(String username, String password)
	{
		setusername(username);
		setpassword(password);
		JSONObject user = new JSONObject();
		user.put("Username", username);
		user.put("Password", password);
		try{
		FileWriter file = new FileWriter("D:\\Project\\data\\user.json");
		file.write(user.toJSONString());
		file.close();
			}
		catch(IOException e)
			{
		    System.out.println("exception " + e);
            e.printStackTrace();
			}
	}
	public void create(String username, String password) 
	{
	Scanner s = new Scanner(System.in);
	//JSONObject user = new JSONObject();
	//user.put("Username: ", username);
	//user.put("Password: ", password);
	System.out.print("Enter no. of friends want to add: ");
	int n = s.nextInt();
	userwrite(username,password);
	Friends f[] = new Friends[n];
	GsonBuilder builder = new GsonBuilder(); 
	builder.setPrettyPrinting(); 
	Gson gson = builder.create();
	friend = new ArrayList<Friends>();
	for(int i=0;i<n;i++)
	{
		System.out.print("\t\t\tEnter first name: ");
		String fname= s.next();
		System.out.print("\t\t\tEnter last name: ");
		String lname = s.next();
		System.out.print("\t\t\tEnter Address: ");
		String address = s.next();
		System.out.print("\t\t\tEnter Contact: ");
		String contact = s.next();
		System.out.print("\t\t\tEnter Date of Birth: ");
		String dob = s.next();
		f[i] = new Friends(fname,lname,address,contact,dob);
		friend.add(f[i]); // adding every object to the list
	}
	try
	{
		String json = new Gson().toJson(friend);
		FileWriter writer = new FileWriter("D:\\Project\\data\\friends.json");
        writer.write(json);
        writer.close();
        
	}
	catch(IOException e)
	{
		    System.out.println("exception " + e);
            e.printStackTrace();
	}

	}
}