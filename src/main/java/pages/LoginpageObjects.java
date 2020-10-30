package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageObjects {

		// TODO Auto-generated method stub

		//
	@FindBy(xpath="//input[@type=\"email\"]")	
	public static WebElement username;
	
	//click next
	@FindBy(xpath="//span[text()='Next']/..")	
	public static WebElement next;			
			
	@FindBy(xpath="//input[@type=\"password\"]")	
	public static WebElement password;	
	
	

		
		
		
		
	

}
