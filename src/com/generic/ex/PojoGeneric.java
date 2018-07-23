package com.generic.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee <L1, L2, L3, L4> {
	L1 fName;
	L2 lName;
	L3 id;
	L4 Dept;
	public L1 getfName() {
		return fName;
	}

	public void setfName(L1 fName) {
		this.fName = fName;
	}

	public L2 getlName() {
		return lName;
	}

	public void setlName(L2 lName) {
		this.lName = lName;
	}

	public L3 getId() {
		return id;
	}

	public void setId(L3 id) {
		this.id = id;
	}

	public L4 getDept() {
		return Dept;
	}

	public void setDept(L4 dept) {
		Dept = dept;
	}

	

	public Employee(L1 fName, L2 lName, L3 id, L4 dept) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.id = id;
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", id=" + id + ", Dept=" + Dept + "]";
	}
	
	
	
	
}

public class PojoGeneric {
	public static void main (String args[])
	{
		callAccout();
		 getUnionOfSetValues();
	}
	public static void callAccout()
	{
		Employee <String, String, Integer, String> p1=new Employee <>("Bishnu", "K C", 1, "HR");
		String s=p1.getfName();
		String s1=p1.getlName();
		int i=p1.getId();
		String s2=p1.getDept();
		System.out.println(p1);
		System.out.println(s+"\t"+s1+"\t"+i+"\t"+s2);
		//System.out.println(s1);
		//System.out.println(i);
		//System.out.println(s2);

	}
	public static void getUnionOfSetValues()
	{
		Set <String> account = new HashSet<>();
		account.add("Arnold");
		account.add("Bishnu");
		account.add("Milan");
		
		Set <String> hr = new TreeSet<>();
		hr.add("Arnold");
		hr.add("Bishnu");
		hr.add("Milan");
		hr.add("Apple");
		
		Set <String> resultSet= unionOfSets(account, hr);
		
		Iterator <String> it= resultSet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	private static <E>Set <E> unionOfSets(Set <E> account, Set<E> hr)
	{
		Set <E> results= new HashSet<>();
		results.addAll(account);
		results.addAll(hr);
		return results;
	}
}
