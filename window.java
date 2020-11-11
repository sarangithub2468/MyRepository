package bootcamprealtime;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		String Parentwindow = driver.getWindowHandle();

		driver.findElementById("home").click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Number of windows"+ windows.size());
		for  (String win : windows) {
			
			driver.switchTo().window(win);
		}
		
		driver.switchTo().window(Parentwindow);
		
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		driver.findElementByXPath("//button[text()='Do not close me ']").click();

		 
		Set<String> windowslist = driver.getWindowHandles();
		//System.out.println("Number of windows"+ windows.size());
		for  (String wind : windowslist) {
			
 if(!wind.equals(Parentwindow)) {
	 driver.switchTo().window(wind);
	   driver.close();
	 
 }
		}
 driver.quit();
 System.out.println("Success");		

	}

}
