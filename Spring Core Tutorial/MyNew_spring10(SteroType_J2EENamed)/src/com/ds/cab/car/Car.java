package com.ds.cab.car;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Named//instead of @component
public class Car 
{
	@Autowired
private Engine engine;

public void printEng()
{
	System.out.println("Engine Name"+engine.getEngName());
}
}
