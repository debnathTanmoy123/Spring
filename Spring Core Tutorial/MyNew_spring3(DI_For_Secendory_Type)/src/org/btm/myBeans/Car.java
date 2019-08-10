package org.btm.myBeans;

public class Car {
	public Car() {

	System.out.println("car");
	}
private String carName;
private Engine engine;
public void setCarName(String carName) {
	this.carName = carName;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void printData()
{
	System.out.println("Car Name: "+carName);
	System.out.println("Model Year: "+engine.getModelYear());
}
}
