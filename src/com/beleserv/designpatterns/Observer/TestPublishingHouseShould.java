package com.beleserv.designpatterns.Observer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestPublishingHouseShould {

	private PublishingHouse publisher;
	private String newsTitle = "News Title";
	private String newsBody = "News Body";

	@Before
	public void init() {
		publisher = new PublishingHouse();
	}
	
	@Test
	public void registerAnObserver() {
		FamilyOfFive familyOfFive = new FamilyOfFive();
		publisher.registerObserver(familyOfFive);
		assertEquals(familyOfFive, publisher.listObservers().get(0));
	}
	
	@Test
	public void removeAnObserver() {
		LocalCafe localCafe = new LocalCafe();
		publisher.registerObserver(localCafe);
		assertEquals(localCafe, publisher.listObservers().get(0));

		publisher.removeObserver(localCafe);
		assertEquals(new ArrayList<Observer>(), publisher.listObservers());
	}

	@Test
	public void notifyObservers() {
		FamilyOfFive familyOfFive = new FamilyOfFive();
		ConvenienceStore convenienceStore = new ConvenienceStore();
		LocalCafe localCafe = new LocalCafe();
		publisher.registerObserver(familyOfFive);
		publisher.registerObserver(convenienceStore);
		publisher.registerObserver(localCafe);
		publisher.setNews(newsTitle, newsBody);
		assertEquals(newsTitle + " " + newsBody, familyOfFive.display());
		assertEquals(newsTitle + " - " + newsBody, convenienceStore.display());
		assertEquals(newsTitle + " *** " + newsBody, localCafe.display());
	}
	
}
