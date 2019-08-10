package org.btm.myTest;

import org.btm.myBeans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Test t=(Test) context.getBean("t");
t.printData();
}
}
