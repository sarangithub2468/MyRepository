package bootcamprealtime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("http://leafground.com/pages/upload.html");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByName("filename").click();	

		driver.findElementByXPath("//input[@name=\"filename\"]").click();
		/*try {

			//driver.findElementByXPath("//div/input[@name=\"filename\"]").click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		//C:\\Users\\Saranraj\\Downloads\\C:\Users\Saranraj\DownlC:\Users\Saranraj\Downloads\testleaf.xlsxoads\testleaf.xlsx
		
		
		StringSelection selection = new StringSelection("C:\\Users\\Saranraj\\Downloads\\testleaf.xlsx");
		//stringselectio  cassl tranfer string into plain text
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.close();

		
	}

}
