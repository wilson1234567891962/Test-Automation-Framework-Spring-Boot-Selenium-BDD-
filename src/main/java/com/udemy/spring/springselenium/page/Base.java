package com.udemy.spring.springselenium.page;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public abstract class Base {

    @Autowired
	protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init() {
        PageFactory.initElements(this.driver, this );
    }

    public abstract  boolean isAt();
}