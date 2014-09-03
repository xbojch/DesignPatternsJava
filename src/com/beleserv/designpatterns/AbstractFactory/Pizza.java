package com.beleserv.designpatterns.AbstractFactory;

public abstract class Pizza {

	private String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Veggies[] veggies;
	protected Pepperoni pepperoni;
	protected Clams clams;


	abstract void prepare();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDough() {
		return dough.toString();
	}
	
	public String getSauce() {
		return sauce.toString();
	}
	
	public String getCheese() {
		return cheese.toString();
	}
	
	public String getVeggies() {
		StringBuilder veggiesNames = new StringBuilder();
		for(int i = 0; i < veggies.length; i++) {
			veggiesNames.append(veggies[i].toString());
			if(i < veggies.length - 1) {
				veggiesNames.append(", ");
			}
		}
		
		return veggiesNames.toString();
	}

	public String getPepperoni() {
		return pepperoni.toString();
	}

	public String getClams() {
		return clams.toString();
	}
}
