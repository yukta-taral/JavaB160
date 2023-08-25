package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Rbi r=new Sbi();
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("  1 = create account   " + " 2 = display alldetails   " + " 3 = deposite money  " + " 4 = withdrawal  " + " 5 = balance check  ");
		System.out.println("enter choise");
		int ch=sc.nextInt();
		/*switch(ch)
		{
		case 1:r.createAccount();
		case 2:r.displayAllDetails();
		case 3:r.depositeMoney();
		case 4:r.withdrawal();
		case 5:r.balanceCheck();
		break;
		default:System.out.println("invalide choise");
		}
		
		}*/
	
		if (ch==1)
		{
			r.createAccount();
		}
		else if (ch==2)
		{
			r.displayAllDetails();
		}
		else if(ch==3)
		{
			r.depositeMoney();
		}
		else if(ch==4)
		{
			r.withdrawal();
		}
		else if(ch==5)
		{
			r.balanceCheck();
		}
		else
		{
			System.out.println("invalide output");
		}
	   }
    }
}
