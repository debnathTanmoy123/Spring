package beans;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Qualifier;

public class Car 
{
	
	//AutoWiring using byName
	@Resource
	@Qualifier(value="engine")
private Engine engine;
//no need to have setters or constructor
	
public void printData()
{

	System.out.println("EngineModel year: "+engine.getModelYear());
}
}
