package com.udemy.spring.springselenium.test.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("accord")
public class Accord implements Car {

	@Override
	public void run() {
		System.out.println("This is Accord. Speed is 80 mph.");
	}

}
