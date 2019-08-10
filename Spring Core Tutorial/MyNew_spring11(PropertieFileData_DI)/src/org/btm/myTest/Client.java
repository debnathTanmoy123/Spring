package org.btm.myTest;

import org.btm.myBeans.CP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
CP c=(CP) context.getBean("cp");
c.createConnection();
}
}
