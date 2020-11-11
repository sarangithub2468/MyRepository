package bootcamprealtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("https://letcode.in/file");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//div//span[text()='Next']		
		driver.findElementByXPath("//span[@class=\"file-label\"]").sendKeys("D:\\Saran Personal\\TLBOOTCAMP\\Learnings.txt");

		Thread.sleep(5000);
		System.out.println("attached");
	}

}
