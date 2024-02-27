package com.flipkart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

	WebDriver driver;
	
	public FlipkartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class ='Pke_EE']")
	private WebElement searchWE;
	
	@FindBy(xpath = "//a[@class = '_1fQZEK']")//xpath = //div[@class = '_1YokD2 _3Mn1Gg']/div[@class = '_1AtVbE col-12-12']/div[@class = '_13oc-S']
	private WebElement allResultWE;
	
	@FindBy(xpath = "//div[@class = '_1kidPb']//span[3]")
	private WebElement menuMenWE;
	
	@FindBy(xpath = "//div[@class = '_1QrT3s']")
	private WebElement menCategoryWE;
	
	//===xpath = //*[@class = '_3QN6WI' and @title = 'Jeans']
	//===xpath = //div[@class = '_1QrT3s']/div/following::a
	//===xpath = //div[@class = '_1QrT3s']/div/following-sibling::a
	//===xpath = //*[@title = 'Jeans']/ancestor::div[1]
	//===xpath = //*[@title = 'Jeans']/ancestor::div[1]/parent::div
	//========================================================================================
	
	
	public void enterUrl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void srchMyMob(String mobName) 
	{
		searchWE.clear();
		searchWE.sendKeys(mobName);
//		action.sendKeys(Keys.ENTER);
		searchWE.sendKeys(Keys.ENTER);
	}
	
	public void countResult()
	{
		List<WebElement> list = driver.findElements(By.xpath("//a[@class = '_1fQZEK']"));
		
		System.out.println("Result Count as:"+list.size());
		
		System.out.println("======================"+list.get(3).getText());		
	}
	
	public void handleTopMenu()
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuMenWE).perform();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = '_1QrT3s']//a"));
		 //div[@class = '_1QrT3s']//div[@class = '_1fwVde']//a
		//div[@class = '_1QrT3s']//div//a[.] Correct
		//div[@class = '_1QrT3s']//div//a Correct
		System.out.println("========================================"+list.size());
		
		for(int i=1; i<5; i++)
		{
		String str = list.get(i).getText();
		System.out.println(str+"========================================");
		}
	}
	
	public void clickOnMensCategory(String text)
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuMenWE).perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = '_1QrT3s']//a"));
		
		for(int i=0; i<5; i++)
		{
		String str = list.get(i).getText();
		System.out.println(str+"========================================");
		}
		
	}
}
