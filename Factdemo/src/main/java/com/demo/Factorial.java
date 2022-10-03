package com.demo;

public class Factorial 
{
         
	public int fact(int input)
	{
		
		int num = input;
		int rem,result=0;
		int mul =10;
		while(num>=1)
		{
		rem = num%10;
		num = num/10;
		result =result*mul+rem; 
	    }
		return result;
}
}