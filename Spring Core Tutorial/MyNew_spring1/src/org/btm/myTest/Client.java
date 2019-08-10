package org.btm.myTest;


import org.btm.myBeans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Client {
	public static void main(String[] args) {
		//find xml
		Resource r=new ClassPathResource("spring.xml");
		//load xml into IOC container
		BeanFactory factory=new XmlBeanFactory(r);
		//CREATE TEST class object
		Object o=factory.getBean("t");
		Object o1=factory.getBean("t");
		Object o2=factory.getBean("t");
		
		System.out.println(o1==o2);
		System.out.println(o==o1);
		
		Test t=(Test) o;
		t.hello();
		
		
		
		
}

}
