package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	Scanner sc=new Scanner(System.in);
    Account a=new Account();
    
	@Override
	public void createAccount()
	{
		System.out.println("enter account no");
		a.setAccno(sc.nextInt());
		System.out.println("enter name");
		a.setName(sc.next());
		System.out.println("enter mobno");
		a.setMobno(sc.next());
		System.out.println("enter adhar no");
		a.setAdharno(sc.next());
		System.out.println("enter gender");
	    a.setGender(sc.next());
	    System.out.println("enter age");
	    a.setAge(sc.nextByte());
	    System.out.println("enter balance");
	    a.setBalance(sc.nextDouble());
		
	}

	@Override
	public void displayAllDetails()
	{
		System.out.println("account no ="+a.getAccno());
		System.out.println("name is="+a.getName());
		System.out.println("mobile no is="+a.getMobno());
		System.out.println("adhar number="+a.getAdharno());
		System.out.println("gender is="+a.getGender());
		System.out.println("age is="+a.getAge());
		System.out.println("balnce is"+a.getBalance());
		
		
	}

	@Override
	public void depositeMoney() 
	{
	System.out.println("enter money ammont for deposite");	
	double d=a.getBalance()+sc.nextDouble();
	a.setBalance(d);
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("money ammont for withdrawal");	
		double d1=a.getBalance()-sc.nextDouble();
		a.setBalance(d1);
			
	}

	@Override
	public void balanceCheck() 
	{
		System.out.println(a.getBalance());
		
	}
	

}
