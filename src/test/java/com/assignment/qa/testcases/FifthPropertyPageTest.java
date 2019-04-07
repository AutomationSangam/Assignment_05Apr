package com.assignment.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.qa.base.TestBase;
import com.assignment.qa.pages.FifthPropertyPage;
import com.assignment.qa.pages.HomePage;
import com.assignment.qa.pages.SearchResultPage;

public class FifthPropertyPageTest extends TestBase {
	
	HomePage homepage;
	SearchResultPage results;
	FifthPropertyPage agent;
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new HomePage();
		results=homepage.Searchtext();
		agent=results.clickonfifthlink();
	}
	@Test(priority=3)
	public void logotest() {
		Assert.assertTrue(agent.logo());
	}
	
	@Test(priority=1)
	public void agentnametest() {
		Assert.assertTrue(agent.agentname());
	}
	@Test(priority=2)
	public void phonnotest() {
		Assert.assertTrue(agent.agentphoneno());
		
	}
	@Test(priority=4)
	public void compareagentvaluetest() {
		Assert.assertTrue(agent.dealerdetailpage());
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
