package org.btm.myBeans;

public class Bus {
private Engine engine;
public Bus(Engine engine)
{
System.out.println("parameter bus constractor");
this.engine=engine;
}


public void setEngine(Engine engine) 
{
	System.out.println("setter Engine");
	this.engine = engine;
}


public void printData()
{
	System.out.println("Bus engine moel year: "+engine.getModelYear());
}
}
