package org.btm.myBeans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car 
{
	
	
	@Autowired
	@Qualifier(value="e2")
private Engine engine;
//no need to have setters or constructor
	
public void printData()
{

	System.out.println("EngineModel year: "+engine.getModelYear());
}
}
