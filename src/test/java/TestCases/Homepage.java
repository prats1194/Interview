package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage2;
import TestBase.initialize;

public class Homepage extends initialize {
	
	@Test
	public void basepagenavigate() throws IOException, InterruptedException {
		driver=initializedriver();
		
		driver.get("https://www.google.com");
	// One is inheritance	
		// create object and invoke method
		LandingPage lp=new LandingPage(driver);
		
		driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-outside-horizontal-resize-handles sumome-react-wysiwyg-outside-vertical-resize-handles sumome-react-wysiwyg-close-button sumome-react-wysiwyg-popup-image sumome-react-wysiwyg-image']//div[2]")).click();
		Thread.sleep(5000);
		lp.getlogin().click();
		Thread.sleep(5000);	
		
		LoginPage2 lp2=new LoginPage2(driver);
		
		lp2.getEmail().sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		lp2.getPassword().sendKeys("bcd@gmail.com");
		Thread.sleep(5000);
		lp2.getLogin().click();
	}

}
