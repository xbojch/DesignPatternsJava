package com.beleserv.designpatterns.Observer;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class FamilyOfFiveShould {

	private FamilyOfFive familyOfFive;
	private String newsTitle = "News Title";
	private String newsBody = "News Body";

	@Before
	public void init() {
		familyOfFive = new FamilyOfFive();
	}
	
	@Test
	public void updateNews() {
		familyOfFive.update(newsTitle, newsBody);
	}
	
	@Test
	public void displayNews() {
		familyOfFive.update(newsTitle, newsBody);
		assertEquals(newsTitle + " " + newsBody, familyOfFive.display());
	}

}
