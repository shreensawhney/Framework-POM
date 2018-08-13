package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver ;
	
@BeforeMethod
public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Desktop\\Applications-Testing\\Third Party exe zips for opening browser for Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();           // For understanding we will not need this but instead use the one below
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.get("http://freecrm.com");
	Thread.sleep(2000);
}
 @Test	
public void getTitle() {
String title =  driver.getTitle();
 }
 
@Test
public void FreeCRMLogoTest() {
boolean b = driver.findElement(By.xpath("//a[@class='navbar-brand']//img[@class='img-responsive']")).isDisplayed(); 
Assert.assertTrue(b); 
}

@AfterTest
public void tearDown() {
driver.quit();}
 
}


