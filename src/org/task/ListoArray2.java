package org.task;

import java.util.ArrayList;
import java.util.List;

public class ListoArray2 {
	public static void main(String[] args) {
		List <String> Li = new ArrayList<String>();
		Li.add("Hello");
		Li.add("all");
		Li.add("welcome");
		Li.add("to");
		Li.add("class");
		System.out.println(Li);
		String[] arr = new String[Li.size()];
		for(int i=0; i<Li.size();i++)
		{
			 arr[i] = Li.get(i);
		}
		for(String s : arr)
		{
			System.out.print(" "+s);
		}
		
		
	}

}
