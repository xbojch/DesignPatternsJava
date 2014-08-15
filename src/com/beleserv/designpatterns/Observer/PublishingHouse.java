package com.beleserv.designpatterns.Observer;

import java.util.ArrayList;

public class PublishingHouse implements Subject {

	private ArrayList<Observer> registeredObservers;
	private String newsTitle;
	private String newsBody;
	
	public PublishingHouse() {
		registeredObservers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		registeredObservers.add(observer);
	}

	public ArrayList<Observer> listObservers() {
		return registeredObservers;
	}

	public void removeObserver(Observer observer) {
		int i = registeredObservers.indexOf(observer);
		if(i >= 0) {
			registeredObservers.remove(i);
		}
	}

	public void notifyObservers() {
		for(int i=0; i<registeredObservers.size(); i++) {
			Observer currentObserver = (Observer) registeredObservers.get(i);
			currentObserver.update(newsTitle, newsBody);
		}
		
	}

	public void setChanged() {
		notifyObservers();
	}
	
	public void setNews(String title, String body) {
		newsTitle = title;
		newsBody = body;
		setChanged();
	}

}
