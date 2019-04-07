package com.assignment.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class FifthPropertyPage extends TestBase {

	@FindBy(xpath="//div[@class='dp-sidebar-wrapper__contact']//h4[@class='ui-agent__name']")
	WebElement agentname;
	
	@FindBy(xpath="//div[@class='dp-grid-wrapper']//p[@class='ui-agent__tel ui-agent__text']//a[1]")
	WebElement phoneno;
	
	@FindBy(xpath="//img[@class='js-lazy-loaded']")
	WebElement logo;
	
	
	String agentname1,phoneno1,agentname2,phoneno2,temp;
	
	public FifthPropertyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean agentname() {
		return agentname.isDisplayed();
	}
	public boolean agentphoneno() {
		return phoneno.isDisplayed();
	}
	public boolean logo() {
		return logo.isDisplayed();
	}
	public boolean dealerdetailpage() {
		agentname1=agentname.getText();
		temp=phoneno.getText();
		phoneno1=(temp.replaceAll("Call", "")).trim();
		agentname.click();
		agentname2=driver.findElement(By.xpath("//h1[@class='bottom-half']//b[1]")).getText();
		temp=driver.findElement(By.xpath("//p[@class='medium clearfix bottom-half']//a[@data-ga-action='Call']")).getText();
		phoneno2=temp.replaceAll("\\+44 ", "0");
		if(agentname1.equals(agentname2)&&phoneno1.equals(phoneno2)) {
			return true;
		}else {
			return false;
		}
	}
}
