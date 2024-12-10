package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUser {
    private WebDriver driver;

    // Locators
    private By userMenuLocator = By.xpath("//*[@class='avatar avatar-20 avatar-inline']");
    private By usersManagementOptionLocator = By.xpath("(//*[text()='Users management'])[2]");
    private By iframeLocator = By.xpath("//*[@id='modal-box']");
    private By newUserLocator = By.xpath("//*[text()='New user']");
    private By usernameLocator = By.xpath("//*[@name='username']");
    private By roleDropdownLocator = By.xpath("//*[@name='role']");
    private By passwordLocator = By.xpath("//*[@name='password']");
    private By confirmationLocator = By.xpath("//*[@name='confirmation']");
    private By submitLocator = By.xpath("//*[@type='submit']");

    // Constructor to initialize WebDriver
    public CreateNewUser(WebDriver driver) {
        this.driver = driver;
    }

    // Method to navigate to the "Users Management" section
    public void navigateToUsersManagement() {
        driver.findElement(userMenuLocator).click();
        driver.findElement(usersManagementOptionLocator).click();
    }

    // Generic method to create a new user
    public void createUser(String username, String role, String password)
    {
        // Click on "New User"
        driver.findElement(newUserLocator).click();

        // Switch to iframe
        WebElement frame = driver.findElement(iframeLocator);
        driver.switchTo().frame(frame);

        // Fill in user details
        driver.findElement(usernameLocator).sendKeys(username);
        WebElement roleDropdown = driver.findElement(roleDropdownLocator);
        new Select(roleDropdown).selectByVisibleText(role);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(confirmationLocator).sendKeys(password);

        // Submit the form
        driver.findElement(submitLocator).click();

        // Switch back to the default content
        driver.switchTo().defaultContent();
    }
}












/*
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class createNewUser {
	public WebDriver driver;
	 private By userMenuLocator = By.xpath("//*[@class='avatar avatar-20 avatar-inline']");
	    private By usersManagementOptionLocator = By.xpath("(//*[text()='Users management'])[2]");
	    private By iframeLocator = By.xpath("//*[@id='modal-box']");
	    private By usrNmeLocator = By.xpath(" //*[@name='username']");
	    private By roleDropdLocator = By.xpath("//*[@name='role']");
	    private By passwrdLocator = By.xpath("//*[@name='password']");
	    private By confirmationLocator = By.xpath("//*[@name='confirmation']");
	    private By submitLocator = By.xpath("//*[@type='submit']");
	    private By NewUserLocator = By.xpath("//*[text()='New user']");
	    
	   {   WebElement  NewUser=driver.findElement(NewUserLocator);
   	  WebElement  frame=driver.findElement(iframeLocator);
   	 driver.switchTo().frame(frame);
   	 WebElement  usrNme=driver.findElement(usrNmeLocator);
   	 WebElement  roleDropd=driver.findElement(roleDropdLocator);
   	 WebElement   passwrd=driver.findElement(passwrdLocator);
   	 WebElement   submit=driver.findElement(submitLocator);
   	 WebElement    confirmat=driver.findElement(confirmationLocator);
	    }  
	   
	    @BeforeMethod
   	 public void UM() 
	    {
	    	WebElement  userMenu=driver.findElement(userMenuLocator);
	    	userMenu.click();
	    	WebElement  usersManagement=driver.findElement(usersManagementOptionLocator);
	    	usersManagement.click();
	    }
	    
	    
	  
	    public void testmanager() 
	    {
	    	driver.findElement(NewUserLocator).click();
	    	 WebElement  frame=driver.findElement(iframeLocator);
	       	 driver.switchTo().frame(frame);
	       	driver.findElement(usrNmeLocator).sendKeys(uname);
	       	WebElement  roleDropd=driver.findElement(roleDropdLocator);
	       	Select rol=new Select(roleDropd);
	       	rol.selectByVisibleText(role);//"testmanager""manager"
	       
	       	driver.findElement(passwrdLocator).sendKeys("testmanager");
	       	driver.findElement(confirmationLocator).sendKeys("testmanager");
	       	driver.findElement(submitLocator).click();
	    	 
	    }

	    public void testuser() 
	    {
	    	driver.findElement(NewUserLocator).click();
	    	 WebElement  frame=driver.findElement(iframeLocator);
	       	 driver.switchTo().frame(frame);
	       	driver.findElement(usrNmeLocator).sendKeys("testuser");
	       	WebElement  roleDropd=driver.findElement(roleDropdLocator);
	       	Select rol=new Select(roleDropd);
	       	rol.selectByVisibleText("User");
	       
	       	driver.findElement(passwrdLocator).sendKeys("testuser");
	       	driver.findElement(confirmationLocator).sendKeys("testuser");
	       	driver.findElement(submitLocator).click();
	    	 
	    }
	    
	    public void testviewer() 
	    {
	    	driver.findElement(NewUserLocator).click();
	    	 WebElement  frame=driver.findElement(iframeLocator);
	       	 driver.switchTo().frame(frame);
	       	driver.findElement(usrNmeLocator).sendKeys("testviewer");
	       	WebElement  roleDropd=driver.findElement(roleDropdLocator);
	       	Select rol=new Select(roleDropd);
	       	rol.selectByVisibleText("User");
	       
	       	driver.findElement(passwrdLocator).sendKeys("testviewer");
	       	driver.findElement(confirmationLocator).sendKeys("testviewer");
	       	driver.findElement(submitLocator).click();
	    	 
	    }
}

*/

