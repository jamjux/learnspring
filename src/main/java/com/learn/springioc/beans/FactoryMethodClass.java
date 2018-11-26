package com.learn.springioc.beans;

public class FactoryMethodClass {
	
	private String xm = "xumeng";
	
	private String meng = "meng";
	
	public String createXm() {
		return xm;
	}
	
	public String createMeng() {
		return meng;
	}

}
