package com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotFileHandlerClass {

	WebDriver driver = null;

	@Test
	public void TakeScreenshotFileHandler() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		String url = "http://demo.automationtesting.in/Register.html";
		driver.get(url);
		Thread.sleep(5000);
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File("E://New Eclipse//com.demo//screenshots//image.png"));
		
		FileHandler.copy(screenshot, new File("E://New Eclipse//com.demo//screenshots//image2.png"));
		
		Thread.sleep(5000);

	}
}
