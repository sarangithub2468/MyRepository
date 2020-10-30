package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
		// TODO Auto-generated method stub
public static RemoteWebDriver driver;
public static Properties properties;
public static String userName;
public  static String passWord;
public static ExtentHtmlReporter reporter;
public static ExtentReports rep;

public ExtentTest test;

public String testName,testDesc,author,category;

static Logger logger = Logger.getLogger(Baseclass.class);

public Properties loadpropertyfile() throws IOException {	
	FileInputStream file = new FileInputStream("./src/main/resources/Resource/Config.properties");
	//Properties prop = new Properties();
	properties = new Properties();
	properties.load(file);	
	return properties;      	
	//properties inside method so declare @class levela nsd make as statci to give that it is owned to all class leel
}
	//ExtentReports reports = new ExtentReports();
/*@BeforeSuite
public void startReport() {
	reporter = new ExtentHtmlReporter("./ExtentReports.result.html");
	reporter.setAppendExisting(true);
	rep = new ExtentReports();
	rep.attachReporter(reporter);
}

@BeforeTest	
public void seetinfo() {	
testName="Checkemailandverify";
testDesc="Sendemail with attachment and verify";
author="Saran";
category="smoke";

}

@BeforeClass
public void testDetails() {

	test = rep.createTest(testName, testDesc);
	test.assignAuthor(author);
	test.assignCategory(category);

}
*/
@BeforeSuite
public void launchbrowser() throws IOException {
	//info debug warn error fatal	
	
	reporter = new ExtentHtmlReporter("./ExtentReports.result.html");
	reporter.setAppendExisting(true);
	rep = new ExtentReports();
	rep.attachReporter(reporter);
	
	
PropertyConfigurator.configure("./src/main/resources/Resource/log4j.properties");
logger.info("Loading the Property File");

loadpropertyfile();
String url = properties.getProperty("Url");
userName = properties.getProperty("username");
System.out.println(userName);
passWord = properties.getProperty("password");
System.out.println(passWord);

String browser =properties.getProperty("browser");
System.out.println(browser);
//String url = "http://www.gmail.com";
System.out.println(url);
if (browser.equalsIgnoreCase("Chrome")){		
WebDriverManager.chromedriver().setup();		
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
 driver = new ChromeDriver(options);
}
else if (browser.equalsIgnoreCase("Firefox")){
WebDriverManager.firefoxdriver().setup();			
FirefoxOptions options = new FirefoxOptions();
options.addPreference("dom.webnotifications.enabled", false);
driver=new FirefoxDriver(options);
}
logger.info("Navigating to Application");
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@AfterSuite
public void closebrowser() {
	logger.info("Closing the browser");
	driver.close();

}
	
/*@AfterSuite
public void endReport() {
		
	rep.flush();

	}*/


		
}
