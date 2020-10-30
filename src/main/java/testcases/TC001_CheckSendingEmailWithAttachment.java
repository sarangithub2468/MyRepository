package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.ComposeemailPage;
import pages.LoginpageObjects;

public class TC001_CheckSendingEmailWithAttachment extends Baseclass {
	 //before @test suite will happen
@BeforeTest
public void setinfo() {
testName="Checkemailandverify";
testDesc="Sendemail with attachment and verify";
author="Saran";
category="smoke";

test = rep.createTest(testName, testDesc);
test.assignAuthor(author);
test.assignCategory(category);
}
	public void login(String userName,String passWord) throws InterruptedException {	

				PageFactory.initElements(driver, LoginpageObjects.class);
				LoginpageObjects.username.clear();  
				LoginpageObjects.username.sendKeys(userName);
				Thread.sleep(2000);
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30))
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'App Launcher')]/parent::div")));
				LoginpageObjects.next.click();
				Thread.sleep(2000);
				LoginpageObjects.password.clear();
				Thread.sleep(2000);
				LoginpageObjects.password.sendKeys(passWord);	
				Thread.sleep(2000);
				LoginpageObjects.next.click();
				Thread.sleep(2000);

	}
		public void Composeemailwithattachment() throws InterruptedException, AWTException {				
			String subJect = "Learning Bootcamp text Doc Attached";	
			PageFactory.initElements(driver, ComposeemailPage.class);
			ComposeemailPage.compose.click();			
			ComposeemailPage.attach.click();
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
			ComposeemailPage.clicktoRecipients.click();		
			ComposeemailPage.Clickto.sendKeys("saransgoodfortune@gmail.com");			
			ComposeemailPage.subject.sendKeys(subJect);			
			ComposeemailPage.clicksend.click();
		}
	@Test
		public void checksendingemail() throws InterruptedException, AWTException {
			
			login(userName,passWord);
			Composeemailwithattachment();
			System.out.println("EmailSentwith Attachment");
			Thread.sleep(3000);
		}
			
			


}
