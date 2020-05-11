package com.compilemain;
import com.processor.CreateUser;
import com.processor.LoginUser;
import java.util.Scanner;
import java.io.*;
class Main
{
	public static void clrscr()//for clear screen
	{
		try 
		{
        	if (System.getProperty("os.name").contains("Windows"))
        	{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        	}

        else
        	{
            Runtime.getRuntime().exec("clear");
        	}
    	} 
    	catch (IOException | InterruptedException ex) 
    	{

    	}

	}    
	public static void main(String []args)// Method of Start screen when the program is executed first time
	{
		
		int a=0;
		
		CreateUser u = new CreateUser();
		while(a!=3){
		clrscr();
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*************************************** WELCOME TO FRIEND LIST **************************************************");
		System.out.println("*************************** Developed By: ***********************************************************************");
		System.out.println("*************************** 19CSU077(Deepanshu Goel)*************************************************************");
		System.out.println("*************************** 19CSU068(Bhavya Panwar)**************************************************************");
		System.out.println("*************************** 19CSU075(Deepak)*********************************************************************");
		System.out.println("*************************** 19CSU063(Bhavana)********************************************************************");
		System.out.println("*************************** 19CSU059(Ayush)**********************************************************************");
		System.out.println("*****************************************************************************************************************");


		System.out.println("\t\t\t\t 1.Login:");
		System.out.println("\t\t\t\t 2.Create new account:");
		System.out.println("\t\t\t\t 3.Exit");
		System.out.print("\t\t\t\t Enter Your Choice: ");
		Scanner input = new Scanner(System.in);
		 a = input.nextInt();        //Choice variable 
		switch(a)
				{
					
		
		case 1: u.case1(); // for login
			break;
		
		case 2: u.getuser(); // for creating new Account
			break;
			
		case 3: break;
		
				}
			}
	}
}
