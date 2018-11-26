package com.learn.springioc.learnioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.springioc.beans.Xumeng;

public class LearnIoc {
    
    public static void main(String[] args) {
    //ÊµÀý»¯ÈÝÆ÷
	ApplicationContext application = new ClassPathXmlApplicationContext("springioc/spring.xml");
	
	Xumeng xumeng = application.getBean(Xumeng.class);
	
	System.out.println(xumeng);
	
    }

}
