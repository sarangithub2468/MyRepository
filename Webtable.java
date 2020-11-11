package bootcamprealtime;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");
		
/*		List<WebElement> columns = driver.findElementsByXPath("//table/tbody/tr/th");
		System.out.println(columns.size());
		List<WebElement> rows = driver.findElementsByXPath("//table/tbody/tr");
		System.out.println(rows.size());*/
		List<WebElement> columnvalues = driver.findElementsByXPath("//table/tbody/tr/td");
		System.out.println(columnvalues.size());
     	/*for (int i = 0; i < columnvalues.size(); i++) {
			
			String text = columnvalues.get(i).getText();
			System.out.println(text);
			if(text.equals("100%")) {
				driver.findElementByXPath("//td[contains(text(),'100%')]/following::input[1]").click();

			}
			else {
				System.out.println("unsuccess");
			}

		}*/
			for (int i = 0; i < columnvalues.size(); i++) {
			
			String text = columnvalues.get(i).getText();
			System.out.println(text);
			
			while(text.equals("100%")) 
				break;			
			driver.findElementByXPath("//td[contains(text(),'100%')]/following::input[1]").click();
			System.out.println("clicked");
			
			}

		
/*		for (WebElement ele : rows) {  
			String text2 = ele.getText();
			System.out.println(text2);

			
		}*/
/*		for (int i = 1; i < rows.size(); i++) {
			
			String text = rows.get(i).getText();
			System.out.println(text);
	
		}*/
		}



	}

