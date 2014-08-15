package com.beleserv.designpatterns.Observer;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class LocalCafeShould {

	private LocalCafe localCafe;
	private String newsTitle = "News Title";
	private String newsBody = "News Body";

	@Before
	public void init() {
		localCafe = new LocalCafe();
	}

	@Test
	public void updateNews() {
		localCafe.update(newsTitle, newsBody);
	}

	@Test
	public void displayNews() {
		localCafe.update(newsTitle, newsBody);
		assertEquals(newsTitle + " *** " + newsBody, localCafe.display());
	}
}
