package bootcamprealtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		WebElement drag = driver.findElementByLinkText("Today's Deals");
		WebElement drop	 = driver.findElementById("twotabsearchtextbox");
		Actions ac = new Actions(driver);
		//drag and drop
		//ac.clickAndHold(drag).moveToElement(drop).release(drop).release().build().perform();
	       ac.dragAndDrop(drag, drop).build().perform();

       System.out.println("success");
       
     //span[@id="nav-search-submit-text"]
/*       WebElement ele = driver.findElementByXPath("//span[@id=\"nav-search-submit-text\"]");
       //double click
      ac.doubleClick(ele).build().perform();
      System.out.println("success2");*/
     // ac.sendKeys(drop, Keys.ENTER);
      ac.click(drop).build().perform();      
      ac.sendKeys("mob").build().perform();
      System.out.println("success3");


	}

}
