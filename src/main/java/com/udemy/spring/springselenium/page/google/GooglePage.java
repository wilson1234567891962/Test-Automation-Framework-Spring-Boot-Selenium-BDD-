package com.udemy.spring.springselenium.page.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.udemy.spring.springselenium.page.Base;
@Component
public class GooglePage  extends Base {

	@Autowired
	private SearchComponent searchComponent;
	
	@Autowired
	private SearchResult searchResult;
	
	@Value("${application.url}")
	private String url;

	public void goTo() {
	  this.driver.get(url);	
	}
	
	public SearchComponent getSearchComponent() {
		return searchComponent;
	}

	public void setSearchComponent(SearchComponent searchComponent) {
		this.searchComponent = searchComponent;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}


	@Override
	public boolean isAt() {
		return this.searchComponent.isAt();
	}

}
