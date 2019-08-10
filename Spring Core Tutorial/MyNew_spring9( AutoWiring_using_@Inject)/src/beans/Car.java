package beans;




import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car 
{
	
	//AutoWiring using byName
	@Inject
	@Qualifier(value="e1") //reference should be same as in xml
private Engine engine;
//no need to have setters or constructor
	
public void printData()
{

	System.out.println("EngineModel year: "+engine.getModelYear());
}
}
