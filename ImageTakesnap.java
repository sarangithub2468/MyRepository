package bootcamprealtime;

import java.awt.AWTException;
import java.awt.Dimension;
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

public class ImageTakesnap {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		//int i=1;
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//driver.findElementByLinkText("AGENT LOGIN").click();
		//driver.findElementById("loginbutton").click();		
		takeSnap();
		Thread.sleep(2000);
		System.out.println("Success");
		//driver.switchTo().alert().accept();
	}	
		public static void takeSnap() throws IOException, AWTException {
			//Screensize
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			System.out.println(screenSize);
			Rectangle rect = new Rectangle(screenSize);
			System.out.println(rect);

			//Write file
			BufferedImage img = new Robot().createScreenCapture(rect);
			int i = 1;
			ImageIO.write(img, "png", new File("C:/Users/Saranraj/Desktop/New folder"+i+".png"));
			i++;
		}
		
		
		
	

}
