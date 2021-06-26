package com.udemy.spring.springselenium.test.googletest;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
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
     	this.screenShotUtil.takeScreenShot();
    	Assert.assertTrue(this.googlePage.isAt());
    	this.googlePage.getSearchComponent().search("spring boot");
    	Assert.assertTrue(this.googlePage.getSearchResult().isAt());
     	Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
    }
}
