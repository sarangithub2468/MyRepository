package bootcamprealtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("https://letcode.in/file");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.name("file"));
		element.click();
               //Which calls the autoit exe file
		Runtime.getRuntime().exec("G:/Tutorial/AutoItScripts/upload.exe");

		WinWaitActive("File Upload").Send("G:\Tutorial\AutoItScripts\TestScripts\Test.doc").Send("{ENTER}")
	}

}
