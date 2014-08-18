package com.beleserv.designpatterns.Decorator;

public class CheeseCake extends Dessert {

	public CheeseCake() {
		description = "Cheese Cake";
	}
	
	@Override
	public double cost() {
		return 2.15;
	}

}
