package org.btm.myTest;
import org.btm.myBeans.Bus;
import org.btm.myBeans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	
	//byName and byType
	/*ApplicationContext Context=new ClassPathXmlApplicationContext("spring_byName.xml");
   Car c=(Car) Context.getBean("c");
   c.printData();*/
	
	
	ApplicationContext Context=new ClassPathXmlApplicationContext("spring_autodetect.xml");
	   Bus b=(Bus) Context.getBean("b");
	   b.printData();
	
}
}
