package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotFileHandlerClass {
	
	WebDriver driver = null;
	
  @Test
  public void TakeScreenshotFileHandler() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
  }
}
