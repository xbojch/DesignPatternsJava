package com.beleserv.designpatterns.Decorator;

public abstract class Dessert {

	String description = "Unknown Dessert";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
