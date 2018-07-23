package com.generic.ex;

import java.util.ArrayList;
import java.util.List;
/*
public class GenericsWildCard {
	public static void main(String args[])
	{
		Object obj= new Object();
		String str= "hi";
		obj=str;
		System.out.println(obj);
		Employees emp = new Employees();
		Account acct = new Account();
		emp=acct;
		 ArrayList <Employee> arrList1 = new ArrayList <>();
		 arrList1.add(new Employees());
		 ArrayList <Account> arrList2 = new ArrayList <>();
		 arrList2.add(new Account());
		 
		 
		 // arrList1 = arrList2;
		 ArrayList <?> arr= new ArrayList <> ();
		 arr=arrList1;
		 arr=arrList2;
		 
		 // Upper bound with wild card
		 ArrayList <? extends Employees> arrList4 = new ArrayList <> ();
		 arrList4=arrList2;
		 
		 // Lower bound with wild card
		 ArrayList <? super Employees> arrList5= new ArrayList<>();
		 ArrayList<Object> arrObj =new ArrayList<>();
		 arrList5=arrObj;
		 
		 makeEmployees(arrList1);
		 makeEmployees(arrList2);
	}
	
	public static void makeEmployees(ArrayList<Employees> arrList1)
	{
		for(Employees em : arrList1)
		{
			em.work();
		}
		
	}

}

class Employees {
	 public void work()
	 {
		 System.out.println("Employee is working.");
	 }
}

class Account extends Employees {
	public void work()
	{
		System.out.println("Accountant is working.");
	}
}
*/