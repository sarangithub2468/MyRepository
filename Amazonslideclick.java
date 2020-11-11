package bootcamprealtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonslideclick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement imageEle = driver.findElementByXPath("//li[@class='a-carousel-card' and @aria-hidden='false']//img[@alt='Mobiles']");

		driver.executeScript("arguments[0].click();", imageEle);
		System.out.println("success");
	}

}
