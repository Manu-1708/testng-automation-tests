package com.testng.test;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {
	WebDriver webdriver;
	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
	}

	@Test
	public void testgoogle() {
		webdriver.get("https://www.google.com/");
		String actualTitle = webdriver.getTitle();
		String expctedTitle  = "Google";
		assertEquals(expctedTitle,actualTitle);

		}

        @Test
    public void testfacebook() {	
	webdriver.get("https://www.facebook.com/");
	String actualTitle = webdriver.getTitle();
	String expctedTitle  = "Facebook – log in or sign up";
	assertEquals(expctedTitle,actualTitle);	
	}

       @AfterTest
       public void after() {
    	   webdriver.quit();  
       }
}
       
       






