package com.learn.springioc.beans;

public class StaticFactoryMethod {
	
	private StaticFactoryMethod() {}
	
	private static String service = new String("mengmeng");
	
	public static String getInstance() {
		return service;
	} 
}
