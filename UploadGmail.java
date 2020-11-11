package bootcamprealtime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.KeyUpAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadGmail {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("http://www.gmail.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//div//span[text()='Next']		
		driver.findElementByXPath("//input[@type=\"email\"]").clear();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@type=\"email\"]").sendKeys("saransgoodfortune@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//span[text()='Next']/..").click();
		Thread.sleep(3000);	
		driver.findElementByXPath("//input[@type=\"password\"]").click();
		driver.findElementByXPath("//input[@type=\"password\"]").clear();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@type=\"password\"]").sendKeys("sam24681011");
		driver.findElementByXPath("//span[text()='Next']/..").click();
		Thread.sleep(3000);
		//div[text()='Compose']
		driver.findElementByXPath("//div[text()='Compose']").click();
		//div[@command="Files"]/div
		driver.findElementByXPath("//div[@command=\"Files\"]/div").click();
		//driver.findElementByXPath("//div[@command=\"Files\"]/div").sendKeys("D:\\Saran Personal\\TLBOOTCAMP\\Learnings.txt");
		
		
		
		
		// D:\Saran Personal\TLBOOTCAMP\Learnings Bootcamp.docx
		StringSelection selection = new StringSelection("D:\\Saran Personal\\TLBOOTCAMP\\Learnings.txt");
		System.out.println(selection);
		Thread.sleep(1000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(1000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Attachment success");
		Thread.sleep(5000);

		//driver.close();
		//span[text()='To']/following::div[@id=":qu"]//textarea
		//div/div[text()='Recipients']
		driver.findElementByXPath("//div/div[text()='Recipients']").click();
		driver.findElementByXPath("(//span[text()='To']/following::textarea)[1]").sendKeys("saransgoodfortune@gmail.com");
		//input[@name="subjectbox"]
		driver.findElementByXPath("//input[@name=\"subjectbox\"]").sendKeys("Learning Bootcamp text Doc Attached");
		Thread.sleep(2000);

		/*//div[@role="textbox"]
		//driver.findElementByXPath("//div[@role=\"textbox\"]/..").sendKeys("Hi Poorani,\r\n" + 
				"		I am Sending you the Selenium Boot camp Learning Doc\r\n" + 
				"\r\n" + 
				"		-- \r\n" + 
				"		With Regards,     "
				+ "Saran");
		//div[text()='Send']
*/		Thread.sleep(3000);

		driver.findElementByXPath("//div[text()='Send']").click();

	}

}
