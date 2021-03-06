package com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotFileHandlerClass2 {

	static WebDriver driver = null;

	@Test
	public void TakeScreenshotFileHandler() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		String url = "http://demo.automationtesting.in/Register.html";
		driver.get(url);
		
		Thread.sleep(5000);
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		File screenshot = edriver.getScreenshotAs(OutputType.FILE);
		
		//File Utils uses copyFil method to story the screenshot
		FileUtils.copyFile(screenshot, new File("E:\\New Eclipse\\com.demo\\screenshots\\image3.png"));
		
		//File Handler uses copy method to store the screenshot
		FileHandler.copy(screenshot, new File("E:\\New Eclipse\\com.demo\\screenshots\\image5.png"));
		
		Thread.sleep(5000);
		
		}
}