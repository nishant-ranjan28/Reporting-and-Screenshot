package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class PageScreenshot {

	WebDriver driver = null;
	int scrollTimeout;

	@Test
	public void TakeFullScreenshot() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "https://github.com";
		driver.get(url);
		
		//It will create a folder called scrrenshot to store the evidence.
		//We can pass path as parameter in save method.
		
		Shutterbug.shootPage(driver).save();
		
		Shutterbug.shootPage(driver).withName("Example").save();
	}
}
