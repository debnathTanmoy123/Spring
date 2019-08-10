package org.btm.myBeans;

public class Test {
	
	private String gender;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void hello(String name)
	{
		System.out.println("Hello.."+gender+" "+name);
	}
}
