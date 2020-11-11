package bootcamprealtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollwebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);				
		//Load the url		
		driver.get("https://www.amazon.com/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();				

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scriolll to bottom of web page suing pixel
		js.executeScript("window.scrollby(0,1000)");
		
		//scrollignpage till end element -- scroll into vieww
		//js.executeScript("arguments[0],scrollIntoView()",webelement);
		
		//scrollign by page height
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//System.out.println("Scrolling success");
		
	}

	

}
