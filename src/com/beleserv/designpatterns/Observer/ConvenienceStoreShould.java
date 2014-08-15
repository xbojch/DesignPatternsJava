package com.beleserv.designpatterns.Observer;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class ConvenienceStoreShould {

	private ConvenienceStore convenienceStore;
	private String newsTitle = "News Title";
	private String newsBody = "News Body";

	@Before
	public void init() {
		convenienceStore = new ConvenienceStore();
	}
	
	@Test
	public void updateNews() {
		convenienceStore.update(newsTitle, newsBody);
	}
	
	@Test
	public void displayNews() {
		convenienceStore.update(newsTitle, newsBody);
		assertEquals(newsTitle + " - " + newsBody, convenienceStore.display());
	}

}
