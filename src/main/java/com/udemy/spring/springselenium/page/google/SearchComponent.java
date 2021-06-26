package com.udemy.spring.springselenium.page.google;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import com.udemy.spring.springselenium.page.Base;

@Component
public class SearchComponent extends Base {

	@FindBy(name  = "q")
	private WebElement searchBox;
	
	@FindBy(name  = "btnK")
	private List<WebElement> searchBtn;
	
	public void search(final String keyword) {
		this.searchBox.sendKeys(keyword);
		this.searchBox.sendKeys(Keys.TAB);
		this.searchBtn.stream().filter(e-> e.isDisplayed()
				&& e.isEnabled())
		.findFirst()
		.ifPresent(WebElement::click);
	}
	
	@Override
	public boolean isAt() {
		return this.wait.until((d) -> this.searchBox.isDisplayed());
	}

}
