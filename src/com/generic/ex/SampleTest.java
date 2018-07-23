package com.generic.ex;
import java.util.*;

public class SampleTest{
	public static void main(String args[])
	{
		/*
		ArrayList <Object> al = new ArrayList<>();
		al.add("Hello");
		al.add(78);
		al.add(true);
		String str=(String)al.get(0);
		System.out.println(str);
		System.out.println(al);
		*/
		 callToProductClass();
		 getUnionOfSetValues();
		
	}
	public static void callToProductClass()
	{
		Products <String, String> p1=new Products <>("Name", "Discription");
		String str=p1.getItem1();
		String str1=p1.getItem2();
		System.out.println(p1);
		System.out.println(str +"\n" + str1);
	}
	public static void getUnionOfSetValues()
	{
		Set <String> mySet1 = new HashSet<>();
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");
		
		Set <String> mySet2 = new TreeSet<>();
		mySet2.add("DC");
		mySet2.add("DC");
		mySet2.add("DC");
		mySet2.add("PA");
		
		Set <String> resultSet= unionOfSets(mySet1, mySet2);
		
		Iterator <String> it= resultSet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	private static <E>Set <E> unionOfSets(Set <E> mySet1, Set<E> mySet2)
	{
		Set <E> results= new HashSet<>();
		results.addAll(mySet1);
		results.addAll(mySet2);
		return results;
	}
	

}
