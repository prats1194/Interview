package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
 By sigin =	By.cssSelector("a[href*='sign_in']");
 
 By title=By.xpath("//h2[contains(text(),'Featured Courses')]");

 //Objects to be defined on top and methods to be defined in bottom
 
 public LandingPage(WebDriver driver) {

	 this.driver=driver; // this refer to variable defined in own class.
}

public WebElement getlogin() {
	 return driver.findElement(sigin);
 }
 
public WebElement getTitle() {
	return driver.findElement(title);
}

}
