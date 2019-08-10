package org.btm.myTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext Context=new ClassPathXmlApplicationContext("spring.xml");
}
}
