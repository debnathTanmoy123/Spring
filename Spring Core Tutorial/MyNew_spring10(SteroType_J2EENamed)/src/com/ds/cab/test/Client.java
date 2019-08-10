package com.ds.cab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.cab.car.Car;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Car car=(Car) context.getBean(Car.class);
car.printEng();

}
}
