package com.udemy.spring.springselenium.test.condition;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.test.SpringBaseTestNGTest;

public class CarTest extends SpringBaseTestNGTest{
   
	@Qualifier("civic")
	@Autowired
	private Car car;
	
	@Test
	public void cardTest() {
		this.car.run();
	}
}
