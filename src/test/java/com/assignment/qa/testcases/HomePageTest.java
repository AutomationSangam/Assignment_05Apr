package com.assignment.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.qa.base.TestBase;
import com.assignment.qa.pages.HomePage;
import com.assignment.qa.pages.SearchResultPage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	SearchResultPage results;
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new HomePage();
	}
	
	@Test
	public void pagetitletest() {
		Assert.assertEquals(driver.getTitle(), "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
		homepage.Searchtext();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
