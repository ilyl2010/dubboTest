package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationProvider {
	public static void main( String[] args ) throws Exception{
    	ClassPathXmlApplicationContext context=
    			new ClassPathXmlApplicationContext(new String[] {"applicationProvider.xml"});
    	context.start();
    	System.out.println("任意键退出");
    	System.in.read();
    }
}
