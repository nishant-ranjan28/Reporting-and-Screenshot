package reporting;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	
	ExtentReports extent;
	ExtentTest test;
	
  @BeforeTest
  public void  startReport() {
	  
	  extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/MyReport.html",true);
	  
	  extent.addSystemInfo("Hostname", "nishu2811")
	  .addSystemInfo("Environment","QA")
	  .addSystemInfo("username", "nishant");
	  
	  extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
  }
  
  @Test
  public void demoReportPass() {
	  
	  test = extent.startTest("demoReportPass");
	  Assert.assertTrue(true);
	  
	  test.log(LogStatus.PASS, "assert pass as conditions is true");
  }
  
  @Test
  public void demoReportFail() {
	  test = extent.startTest("demoReportFail");
	  Assert.assertTrue(false);
	  
	  test.log(LogStatus.FAIL, "assert fail as conditions is true");
  }
  
  @AfterMethod
  public void getReport(ITestResult result) {
	  if(result.getStatus() == ITestResult.FAILURE) {
		  test.log(LogStatus.FAIL, result.getThrowable());
	  }
	  extent.endTest(test);
  }
  
  @AfterTest
  public void endReport() {
	  extent.flush();
	  extent.close();
  }
}
