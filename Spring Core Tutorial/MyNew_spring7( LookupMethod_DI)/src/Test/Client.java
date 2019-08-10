package Test;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;



public class Client {
public static void main(String[] args) throws  Exception{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Car c=(Car)context.getBean("c");
System.out.println("----CAR-----");
System.out.println(c.getClass().getCanonicalName());
c.myCarEngine();
System.out.println(c.myCarEngine().getEngineName());

System.out.println("----BUS-----");
Bus bs=(Bus)context.getBean("b");
System.out.println(bs.getClass().getCanonicalName());
bs.myBusEngine();
System.out.println(bs.myBusEngine().getEngineName());

System.out.println("----TRUCK-----");
Truck t=(Truck)context.getBean("t");
System.out.println(t.getClass().getCanonicalName());
t.myTruckEngine();
System.out.println(t.myTruckEngine().getEngineName());


}
}
