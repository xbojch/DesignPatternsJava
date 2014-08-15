package com.beleserv.designpatterns.Observer;

public class FamilyOfFive implements NewsSubscriber, Observer {

	private String newsTitle;
	private String newsBody;
	
	public String display() {
		return newsTitle + " " + newsBody;
	}
	
	public void update(String newsTitle, String newsBody) {
		this.newsTitle = newsTitle;
		this.newsBody = newsBody;
	}

}
