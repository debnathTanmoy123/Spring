package beans;

public class Car 
{
private static String carName;

public static void setcarName(String carName) {
	Car.carName = carName;
}
public static void printCar()
{
	System.out.println("Car Name: "+carName);
}
}
