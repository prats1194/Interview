package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage2;
import TestBase.initialize;

public class ValidateTitle extends initialize {
	
	@Test
	public void basepagenavigate() throws IOException, InterruptedException {
		driver=initializedriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("abc")).sendKeys("1234");
		driver.findElement(By.xpath("xyz")).sendKeys("1234");
		driver.findElement(By.xpath("lmn")).sendKeys("1234");
		driver.findElement(By.xpath("pqr")).sendKeys("1234");

		
	// One is inheritance	
		// create object and invoke method
	
	}
	
	public void validateAppTitle() throws InterruptedException {
		LandingPage lp=new LandingPage(driver);
		driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-outside-horizontal-resize-handles sumome-react-wysiwyg-outside-vertical-resize-handles sumome-react-wysiwyg-close-button sumome-react-wysiwyg-popup-image sumome-react-wysiwyg-image']//div[2]")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals(lp.getTitle().getText(), "FC002");
	}

}
