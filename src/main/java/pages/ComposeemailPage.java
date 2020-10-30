package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposeemailPage {

	// TODO Auto-generated method stub
	//click compose	
		@FindBy(xpath="//div[text()='Compose']")	
		public static WebElement compose;
		
		//click attach
		@FindBy(xpath="//div[@command=\"Files\"]/div")	
		public static WebElement attach;	
		
		
	//click ToRecip
		@FindBy(xpath="//div/div[text()='Recipients']")	
		public static WebElement clicktoRecipients;	
	//clickto	
		@FindBy(xpath="(//span[text()='To']/following::textarea)[1]")	
		public static WebElement Clickto;	
	//Enter subject	
		@FindBy(xpath="//input[@name=\"subjectbox\"]")	
		public static WebElement subject;
//click send
		@FindBy(xpath="//div[text()='Send']")	
		public static WebElement clicksend;
	

}
