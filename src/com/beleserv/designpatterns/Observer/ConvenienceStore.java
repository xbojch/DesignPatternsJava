package com.beleserv.designpatterns.Observer;

public class ConvenienceStore implements NewsSubscriber, Observer {

	private String newsTitle;
	private String newsBody;
	
	@Override
	public void update(String newsTitle, String newsBody) {
		this.newsTitle = newsTitle;
		this.newsBody = newsBody;
	}

	@Override
	public String display() {
		return newsTitle + " - " + newsBody;
	}

}
