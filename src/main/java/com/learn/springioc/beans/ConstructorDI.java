package com.learn.springioc.beans;

public class ConstructorDI {
    String x;
    int y;
    /**
     * @param x
     * @param y
     */
    public ConstructorDI(String x, int y) {
	super();
	this.x = x;
	this.y = y;
    }
    
    
}
