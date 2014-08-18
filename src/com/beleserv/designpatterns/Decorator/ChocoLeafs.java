package com.beleserv.designpatterns.Decorator;

public class ChocoLeafs extends CondimentDecorator {

	Dessert dessert;
	
	public ChocoLeafs(Dessert dessert) {
		this.dessert = dessert;
	}
	
	@Override
	public String getDescription() {
		return dessert.getDescription() + ", Choco Leafs";
	}

	@Override
	public double cost() {
		return 0.30 + dessert.cost();
	}

}
