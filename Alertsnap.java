package bootcamprealtime;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsnap {
	
	public static void main(String[] args) throws InterruptedException, HeadlessException, IOException, AWTException {
		
	    //int i=1;
		WebDriverManager.chromedriver().setup();			
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://leafground.com/pages/"
			//	+ "upload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("https://www.makemytrip.com/railways/");
		//driver.findElementByLinkText("AGENT LOGIN").click();
		//driver.findElementById("loginbutton").click();		
		takeSnap();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();


	}
	public static void takeSnap() throws IOException, HeadlessException, AWTException {		
		//Screen Size
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(dimen);
		//Write File
		BufferedImage img = new Robot().createScreenCapture(rec);		
		//int i=1;
		ImageIO.write(img, "jpg", new File("C:\\Users\\Saranraj\\Downloads\\file.jpg"));
		//i++;
	}
	

}


