package com.validator;
import com.exceptions.MissingException;
import com.exceptions.SpecialCharacterException;
import com.exceptions.WeakPasswordException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;
import java.lang.Exception; 

	public class UserValidator
	{
	 public void nameValidator(String userid, String password)
		{
		Properties prop = new Properties();
		FileInputStream input=null;
		//Logger logger = Logger.getLogger(NameValidator.class);
		//PropertyConfigurator.configure("/home/sandeep/Documents/java_prg/guidedprj/configs/logger/logger.properties");
		try{
			input = new FileInputStream("D:\\Project\\configs\\constants\\exception.properties");
			prop.load(input);
			missingusername(userid);
			missingpassword(password);
			missingcharacter(userid);
			invalidusername(userid);
			
	       }
	    catch(MissingException e)
	       {
			
				String s = prop.getProperty("emptyNameMessage");
				System.out.println(s);
			
			}
		catch(SpecialCharacterException e)
		{
				String s = prop.getProperty("specialcharacterMessage");
				System.out.println(s);
				
		}
		//catch(WeakPasswordException e)
		//{
				//String s = prop.getProperty("weakpasswordMessage");
				//System.out.println(s);
				
		//}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

		
   }

	 void missingusername(String userid)throws MissingException
	{
		if (userid=="")
			throw new MissingException("empty Username");

	}

     void missingpassword(String password)throws MissingException
	{
		if (password=="")
		throw new MissingException("Empty Password");
	}

    void missingcharacter(String userid)throws MissingException//@ not present
   {
      Pattern costPattern = Pattern.compile("[@]");
		Matcher costMatcher = costPattern.matcher(userid);
		boolean value = costMatcher.find();
		if (value==false)
			throw new MissingException("Missing Extension Exception");
   }
    void invalidusername(String userid)throws SpecialCharacterException
   {
   		Pattern costPattern = Pattern.compile("[!#$%^&*(,)_]");
   		char n = userid.charAt(0);
   		String temp =Character.toString(n);
   		Matcher costMatcher = costPattern.matcher(temp);
   	 	if(costMatcher.find()==true)
   	 	{
   	 		throw new SpecialCharacterException("Username Special Character Exception");
   	 	}
   }
    void weakpassword(String password)throws WeakPasswordException
   {
   	Pattern costPattern = Pattern.compile("[#$%^&]");
		Matcher costMatcher = costPattern.matcher(password);
		boolean value = costMatcher.find();
		if (value==false)
			throw new WeakPasswordException("Weak Password Exception");
   } 
   
}
 class Testvalidator
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	String userid=s.next();
	String password = s.next();
	UserValidator user = new UserValidator();
	user.nameValidator(userid, password);
	
	}
}
