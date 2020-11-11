package bootcamprealtime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();			
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		WebElement ele = driver.findElementById("tags");
		ele.sendKeys("s");
		Thread.sleep(2000);

		//(//ul)[2]/li
		List<WebElement> elelist = driver.findElementsByXPath("//ul[@id=\"ui-id-1\"]/li");
		elelist.size();
		
		for  (WebElement list : elelist) {
			
			if(list.getText().equals("Web Services")) {
				//driver.findElementByXPath("//li/div[text()='Web Services']").click();
				Thread.sleep(2000);
				list.click();
				System.out.println("webservices selected");
				break;

			}
			else {
				System.out.println("unsuccess");
			}
		}
		
		Thread.sleep(2000);

		driver.close();
		      
	}
	
	

}
