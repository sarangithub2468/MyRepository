package bootcamprealtime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LInks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();			
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		WebElement where = driver.findElementByPartialLinkText("Find where");
		
		String attribute = where.getAttribute("a");
		
		System.out.println(attribute);
		
		WebElement brokenlink = driver.findElementByLinkText("Verify am I broken?");
         brokenlink.click();
         String title = driver.getTitle();
         System.out.println(title);
         
         if(title.contains("404")) {
        	 System.out.println("title is broken");
         }
         
        List<WebElement> links = driver.findElementsByTagName("a");
        int linkscount = links.size();
        System.out.println(linkscount);
        
}

}
