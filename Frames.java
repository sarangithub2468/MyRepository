package bootcamprealtime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();			
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElementById("Click1").click();
		
		driver.switchTo().defaultContent();
		List<WebElement>framecount = driver.findElementsByTagName("iframe");
		
		int size = framecount.size();
		System.out.println(size);
		
		driver.close();
	}

}
