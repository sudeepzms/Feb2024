package com.decTest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DecTestPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//textarea[@name = 'q']")
private	WebElement entrTxtWE;
			
			
	public DecTestPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUrl(String url)
	{
		driver.manage().window().maximize();
		System.out.println("Enter URL+++++++++++++++++++++++++++++++++++++++++++++++++");	
		driver.get(url);
	}
	
	public void enterText(String txt)
	{
		entrTxtWE.sendKeys(txt);
		entrTxtWE.sendKeys(Keys.ENTER);
	}
	
	public void checkResultList()
	{
		List<WebElement> ls = driver.findElements(By.xpath("//a[@jsname = 'UWckNb']//h3"));	
		System.out.println(">><<"+ls.size());
		for(int i=0; i<ls.size(); i++)
		{
			System.out.println(">>>>>"+ls.get(i).getText());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+i);
		}
		
				
	}
}
