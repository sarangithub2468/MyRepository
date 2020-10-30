package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentEmailPage {

	@FindBy(xpath="//span/a[text()='Sent']")		
	public static WebElement clicksent;
	
	//click attach
	@FindBy(xpath="((//table)[9]/tbody/tr[1]/td[6]//span/span[contains(text(),\"\")])[1]")	
	public static WebElement getsubjecttext;	
	
	
		
	

}
