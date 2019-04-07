package com.assignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public SearchResultPage Searchtext() {
		
		searchbox.sendKeys("London");
		searchbtn.click();
		return new SearchResultPage();
	}

}
