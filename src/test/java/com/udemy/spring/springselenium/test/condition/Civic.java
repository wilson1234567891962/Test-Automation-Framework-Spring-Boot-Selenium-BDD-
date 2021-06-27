package com.udemy.spring.springselenium.test.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("civic")
public class Civic implements Car {

	@Override
	public void run() {
		System.out.println("This is Civic. Speed is 80 mph.");
	}

}
