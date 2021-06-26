package com.udemy.spring.springselenium.test.condition;


import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.test.SpringBaseTestNGTest;

public class CarTest extends SpringBaseTestNGTest{
   
	@Autowired
	private Car car;
	
	@Test
	public void cardTest() {
		this.car.run();
	}
}
