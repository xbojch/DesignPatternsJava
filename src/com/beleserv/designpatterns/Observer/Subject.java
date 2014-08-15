package com.beleserv.designpatterns.Observer;

import java.util.ArrayList;

public interface Subject {

	public void registerObserver(Observer o);
	public ArrayList<Observer> listObservers();
	public void removeObserver(Observer o);
	public void notifyObservers();
}
