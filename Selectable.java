package bootcamprealtime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
		//*[@id="selectable"]/li
		 List<WebElement> elements = driver.findElementsByXPath("//*[@id=\"selectable\"]/li");
		elements.size();
		
		Actions ac = new Actions(driver);
		
		ac.keyDown(Keys.CONTROL).click(elements.get(0)).click(elements.get(1)).click(elements.get(2)).build().perform();
		driver.close();
		
		//or we casn use click and hold wothoyt pressing control
	}

}
