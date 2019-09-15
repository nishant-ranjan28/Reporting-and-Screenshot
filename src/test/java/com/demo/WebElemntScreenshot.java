package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class WebElemntScreenshot {
	
	WebDriver driver = null;

  @Test
  public void WebElementScreenshot() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "http://demo.automationtesting.in/Register.html";
		driver.get(url);
		WebElement logo = driver.findElement(By.xpath("//img[@id='imagetrgt']"));
		
		Shutterbug.shootElement(driver, logo).withName("logo").save();
  }
}
