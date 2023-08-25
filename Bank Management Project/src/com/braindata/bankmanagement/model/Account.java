package com.braindata.bankmanagement.model;

public class Account {
	private int accno;
	private String name;
	private String mobno;
	private String adharno;
	private String gender;
	private byte age;
	private double balance;
	
	public void setAccno(int accno)
	{
		this.accno = accno;
	}
	public int getAccno()
	{
		return accno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setMobno(String mobno)
	{
		this.mobno = mobno;
	}
	public String getMobno() 
    {
		return mobno;
	}
	public void setAdharno(String adharno)
	{
		this.adharno = adharno;
	}
	public String getAdharno()
	{
		return adharno;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setAge(byte age)
	{
		this.age = age;
	}
	public byte getAge() 
	{
		return age;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}

	

}
