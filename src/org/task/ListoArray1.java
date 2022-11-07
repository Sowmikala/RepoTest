package org.task;
import java.util.*;
import java.util.List;


public class ListoArray1 {
	public static void main(String[] args) {
		
	List <String> Li = new ArrayList<String>();
	Li.add("Hello");
	Li.add("all");
	Li.add("welcome");
	Li.add("to");
	Li.add("class");
	System.out.println(Li);
	
	String[] arr = Li.toArray(new String[0]);
	
	for(String str: arr)
	{
		
		System.out.print(" "+str);
		
	}
	
	
	
	
	}
}
