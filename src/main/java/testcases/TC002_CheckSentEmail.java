package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.LoginpageObjects;
import pages.SentEmailPage;

public class TC002_CheckSentEmail extends Baseclass {
	
/*	public void setFile() {
		testName="Sentemail";
		testDesc="Check sentemail with attachment";
		author="Saran";
		category="smoke";

	}*/
	
@Test
	public void checksentemail() {	
	PageFactory.initElements(driver, SentEmailPage.class);
	SentEmailPage.clicksent.click();	
	String actualtext = SentEmailPage.getsubjecttext.getText();		
	Assert.assertEquals(actualtext, "Learning Bootcamp text Doc Attached");	
		
		
	}

}
