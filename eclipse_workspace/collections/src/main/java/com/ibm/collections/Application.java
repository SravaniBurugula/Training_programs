package com.ibm.collections;

import java.util.LinkedList;

public class Application
{
	public static void main( String[] args )
	{
		HR hr=new HR();
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("AA");
		linkedlist.add("BB");
		linkedlist.add("CC");
		linkedlist.add("DD");
		
		Iterator<String> Iterator = linkedList.iterator();
		
		while(iterator.hashNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		