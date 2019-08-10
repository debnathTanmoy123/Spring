package Test;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;



public class Client {
public static void main(String[] args) throws  Exception{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Bank b=(Bank)context.getBean("b");
System.out.println(b.getClass().getCanonicalName());//proxy class
b.deposite();
b.withdraw();
b.calcInterest();
}
}
