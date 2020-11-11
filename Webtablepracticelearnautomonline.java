package bootcamprealtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtablepracticelearnautomonline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");
		
		List<WebElement> columns = driver.findElementsByXPath("//table/tbody/tr/th");
		System.out.println(columns.size());
		List<WebElement> rows = driver.findElementsByXPath("//table/tbody/tr");
		System.out.println(rows.size());
		
		//td[text()='Learn to interact with Elements']/following::td[1]
WebElement progressvalueele = driver.findElementByXPath("//td[text()='Learn to interact with Elements']/following::td[1]");
String Progressvalue = progressvalueele.getText();
System.out.println(Progressvalue);

	//Check the vital task for least compelted progress

List<WebElement> columnprogress = driver.findElementsByXPath("//td[2]");

List<Integer> numberlist = new ArrayList<Integer>();
for (WebElement ele : columnprogress) {
	
	String text = ele.getText();
	System.out.println(text);
	String numbertext = text.replaceAll("%", "");
	int numbervalue = Integer.parseInt(numbertext);
	numberlist.add(numbervalue);
}

System.out.println(numberlist);
Integer min = Collections.min(numberlist);
System.out.println(min);
 String leastvaluetext = min.toString()+"%";
	
	
	//td[contains(text(),'30%')]/following::input[1]
	WebElement ele = driver.findElementByXPath("//td[contains(text(),'"+leastvaluetext+"')]/following::input[1]");
	System.out.println(ele);
	ele.click();
}
}