package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class manageProject {

	public WebDriver driver;
	 private By usernameField = By.xpath("//label[text()='Username']/following-sibling::input");
	    private By passwordField = By.xpath("//label[text()='Password']/following-sibling::input");
	    private By signInButton = By.xpath("//button[text()='Sign in']");
	    
	    
	    public void loginAsManager()
	    {
	    	driver.findElement(usernameField).sendKeys("testmanager");
	        driver.findElement(passwordField).sendKeys("zxcvbnm");
	        driver.findElement(signInButton).click();
	    }
}
