package org.btm.myTest;


import org.btm.myBeans.Car;
import org.btm.myBeans.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
		/*String files[]=new String[] {"car.xml","engine.xml"};
		ApplicationContext context=new ClassPathXmlApplicationContext(files );*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("car-engine.xml");
		
		Car c=(Car)context.getBean("c");
		c.printData();
		
}

}
