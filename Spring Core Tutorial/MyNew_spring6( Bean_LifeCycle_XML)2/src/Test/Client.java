package Test;
import java.util.Scanner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
public static void main(String[] args) throws  Exception{
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	while (true)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter for save 1and 2 for close");
	int i=sc.nextInt();
	switch (i) 
	{
	case 1:
		Test t=(Test) context.getBean("t");
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
	System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter address");
		String address=sc.next();
		t.save(id, name, email, address);
		
		break;

	default:
		context.close();
		break;
	}
	}
}
}
