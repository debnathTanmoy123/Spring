import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import beans.Test;

public class Client {
	public static void main(String[] args) {
	;
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Test t1=(Test) context.getBean("t");
		Test t2=(Test) context.getBean("t");
		System.out.println(t1.equals(t2));
		Calendar c1=(Calendar) context.getBean("c"); 
		Calendar c2=(Calendar) context.getBean("c"); 
		System.out.println(c1.equals(c2));
		
}

}
