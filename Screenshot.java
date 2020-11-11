package bootcamprealtime;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
		public static void main(String[] args) throws IOException {
			WebDriverManager.chromedriver().setup();		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://leaftaps.com/opentaps");	
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			WebElement eleLogin = driver.findElementByClassName("decorativeSubmit");
			
			File src = eleLogin.getScreenshotAs(OutputType.FILE);
			File dec = new File("./Folder/img33.png");
			FileUtils.copyFile(src, dec); 
			System.out.println("Screenshottaken");
			
			
			
			
	}
	}



