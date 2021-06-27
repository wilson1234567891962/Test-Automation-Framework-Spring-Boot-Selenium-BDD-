package com.udemy.spring.springselenium.test.googletest;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.spring.springselenium.page.google.GooglePage;
import com.udemy.spring.springselenium.test.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.util.ScreenShotUtil;

import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleTest extends SpringBaseTestNGTest {

	@Autowired
	private GooglePage googlePage;
	
	@Autowired
	private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
    	this.googlePage.goTo();
    	Assert.assertTrue(this.googlePage.isAt());
    	Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    	this.googlePage.getSearchComponent().search("environment");
    	Assert.assertTrue(this.googlePage.getSearchResult().isAt());
     	Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
    }
}
