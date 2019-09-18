package com.reverse;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		
		String string = "DESHAN DANIEL";
		
 // one way - logical way
		int length =string.length();
		
		System.out.println(length);
		
		String reverse = "";
		
		for(int i = length-1 ; i>=0;i--)
		{
		   reverse  = reverse + string.charAt(i);
		}
		System.out.println(reverse);
		
 // two way 
		
		StringBuffer obj = new StringBuffer(string);
		System.out.println(obj.reverse());
	}

}
