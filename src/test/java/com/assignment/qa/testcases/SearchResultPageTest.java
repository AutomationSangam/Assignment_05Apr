package com.assignment.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.qa.base.TestBase;
import com.assignment.qa.pages.HomePage;
import com.assignment.qa.pages.SearchResultPage;

public class SearchResultPageTest extends TestBase {
	HomePage homepage;
	SearchResultPage results;
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new HomePage();
		results=homepage.Searchtext();
	}
	
	@Test
	public void titletest() {
		
		Assert.assertEquals(driver.getTitle(), "Property for Sale in London - Buy Properties in London - Zoopla");
		results.sorting();
		results.clickonfifthlink();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
