package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {
	
	public WebDriver driver;
	
By email=By.cssSelector("input[id='user_email']");

	By password=By.cssSelector("input[id='user_password']");

	By submit=By.cssSelector("input[value='Log In']");

	By forgotpassword=By.xpath("//a[@class='link-below-button']");
 
 public LoginPage2(WebDriver driver) {

	 this.driver=driver; // this refer to variable defined in own class.
}


	public WebElement getEmail() {
	return 	driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return 	driver.findElement(password);
		}

	public WebElement getLogin() {
		return 	driver.findElement(submit);
		}
 
}
