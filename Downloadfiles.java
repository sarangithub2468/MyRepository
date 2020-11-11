package bootcamprealtime;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();			
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		
		driver.findElementByLinkText("Download Excel").click();
	//	C:\Users\Saranraj\Downloads
		
		File fileloc = new File("C:\\Users\\Saranraj\\Downloads\\");		
	    File[] listFiles = fileloc.listFiles();	    
	    for (File fil : listFiles) {		
		if(fil.getName().equals("testleaf (1).xlsx")) {
			System.out.println("file is present");			
			break;
		}
			
	else {
				System.out.println("file not found");

			}
			}
		
		
	
	    
	    //list files methid will list all th files in the file locations
        driver.close();

}
}
