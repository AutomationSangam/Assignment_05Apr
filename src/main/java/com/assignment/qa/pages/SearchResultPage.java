package com.assignment.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.assignment.qa.base.TestBase;

public class SearchResultPage extends TestBase {
	
	List<WebElement> pricelist=driver.findElements(By.xpath("//ul[@class='listing-results clearfix js-gtm-list']//a[@class='listing-results-price text-price']"));
	List<Integer> price = new ArrayList<Integer>();
	
	public void sorting() {
		
		for(int i=0;i<pricelist.size();i++) {
			String s=pricelist.get(i).getText();
		price.add(Integer.parseInt(s.replaceAll("[^0-9]", "")));
			
		}
		Collections.sort(price,Collections.reverseOrder());
		for(int i=0;i<price.size();i++) {
			System.out.println(price.get(i));
		}
	}
	
	public FifthPropertyPage clickonfifthlink() {
		pricelist.get(4).click();
		return new FifthPropertyPage();
	}
	

}
