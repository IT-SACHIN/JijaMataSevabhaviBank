package com.jmsbb.test;

import com.jmsbb.demo.Utility;

public class Test {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Todays Date : "+u.getSysDate());
	}
	
	public void m1()
	{
		System.out.println("This utility method");
		System.out.println("Date :"+new Utility().getSysDate());
	}
}
