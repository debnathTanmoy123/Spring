package org.btm.myTest;

import org.btm.myBeans.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) throws Exception {
ApplicationContext context=new 	ClassPathXmlApplicationContext("spring.xml");
	Test test=(Test) context.getBean("t");
	test.printConn();
}
}


