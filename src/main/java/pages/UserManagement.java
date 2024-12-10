/*package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UserManagement;

public class UserManagement {
    private WebDriver driver;
    private UserManagement userManagement;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev");

        // Initialize the UserManagement page object
        userManagement = new UserManagement(driver);
    }

    @Test
    public void testChangeToStrongPassword() {
        // Open user menu and navigate to password change
        userManagement.openUserMenu();
        userManagement.selectUsersManagement();
        userManagement.navigateToChangePassword();

        // Generate and change to a strong password
        String strongPassword = userManagement.generateStrongPassword();
        userManagement.changePassword("Testadmin123", strongPassword);

        // Add assertion for successful password change (if applicable message is displayed)
        WebElement successMessage = driver.findElement(By.xpath("//*[contains(text(), 'Password changed successfully')]"));
        Assert.assertTrue(successMessage.isDisplayed(), "Password change was not successful!");
    }

    private void changePassword(String string, String strongPassword) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}








*/












package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class UserManagement {
    // WebDriver instance
    private WebDriver driver;

    // Locators
    private By userMenuLocator = By.xpath("//*[@class='avatar avatar-20 avatar-inline']");
    private By usersManagementOptionLocator = By.xpath("(//*[text()='Users management'])[2]");
    private By testAdminLocator = By.xpath("//strong[text()='testadmin']");
    private By changePasswordOptionLocator = By.xpath("//*[text()='Change password']");
    private By currentPasswordLocator = By.xpath("//*[@name='current_password']");
    private By newPasswordLocator = By.xpath("//*[@name='password']");
    private By confirmationPasswordLocator = By.xpath("//*[@id='form-confirmation']");
    private By saveButtonLocator = By.xpath("//*[@type='submit']");
    private By LogoutLocator = By.xpath("(//*[text()='Logout'])[2]");
    // Constructor
    public UserManagement(WebDriver driver) {
        this.driver = driver;
    }

    // Method to open the User Menu
    public void openUserMenu() {
        WebElement userMenu = driver.findElement(userMenuLocator);
        userMenu.click();
    }

    // Method to select "Users Management" from the dropdown
    public void selectUsersManagement() {
        WebElement usersManagementOption = driver.findElement(usersManagementOptionLocator);
        usersManagementOption.click();
    }

    // Method to navigate to the Change Password section
    public void navigateToChangePassword() 
    {
        WebElement testAdmin = driver.findElement(testAdminLocator);
        testAdmin.click();

        WebElement changePasswordOption = driver.findElement(changePasswordOptionLocator);
        changePasswordOption.click();
    }

    // Method to change the password
    public void changePassword(String currentPassword, String newPassword) 
    {
        // Enter the current password
        WebElement currentPasswordField = driver.findElement(currentPasswordLocator);
        currentPasswordField.sendKeys(currentPassword);

        // Enter the new password
        WebElement newPasswordField = driver.findElement(newPasswordLocator);
        newPasswordField.sendKeys(newPassword);

        // Confirm the new password
        WebElement confirmationPasswordField = driver.findElement(confirmationPasswordLocator);
        confirmationPasswordField.sendKeys(newPassword);

        // Click the Save button
        WebElement saveButton = driver.findElement(saveButtonLocator);
        saveButton.click();
    }
    
    public void logout()
    {
    	 WebElement userMenu = driver.findElement(userMenuLocator);
         userMenu.click();
         WebElement Logout = driver.findElement(LogoutLocator);
	        Logout.click();
    }
    
	  @AfterMethod
	   
    public void tearDown() {
        // Close the browser after test execution
        if (driver != null) {
            driver.quit();
        }
}

}






















/*	package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


	


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class userManagement {
	    // WebDriver instance
	    private WebDriver driver;

	    // Locators
	    private By userMenu = By.xpath("//*[contains(normalize-space(@class), 'dropdown-menu')]");
	    private By testAdmin = By.xpath("//strong[text()='testadmin']");
	    private By changePassword = By.xpath("//*[text()='Change password']");
	    private By currentPassword = By.xpath("//*[@name='current_password']");
	    private By newPassword = By.xpath("//*[@name='password']");
	    private By conformation = By.xpath("//*[@id='form-confirmation']");
	    private By save = By.xpath("//*[@type='submit']");

	    // Constructor to initialize WebDriver
	    public void userManagement(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to interact with the User Menu
	    public void openUserMenu() {
	        WebElement userMenuElement = driver.findElement(userMenu);
	        userMenuElement.click(); // If it’s a clickable dropdown
	    }

	    // Method to select "Users management" from the dropdown
	    public void selectUsersManagement() {
	        WebElement userMenuElement = driver.findElement(userMenu);
	        userMenuElement.click();
	        WebElement usersManagementOption = driver.findElement(By.xpath("(//*[text()='Users management'])[2]"));
	        		
	        usersManagementOption.click();
	    }

	    // Method to change the password
	    public void changePassword() {
	        // Click the 'testadmin' link
	        WebElement testAdminElement = driver.findElement(testAdmin);
	        testAdminElement.click();

	        // Click the 'Change password' option
	        WebElement changePasswordElement = driver.findElement(changePassword);
	        changePasswordElement.click();
	    }
	    
	    public void newPassword()
	    {
	    	WebElement currentPassword = driver.findElement(currentPassword);
	    	currentPassword.sendKeys("Testadmin123");
	    	WebElement newPassword = driver.findElement(newPassword);
	    	 newPassword.sendKeys("Testadmin1234");
	    	WebElement conformation = driver.findElement(conformation);
	    	conformation.sendKeys("Testadmin1234");
	    	WebElement save = driver.findElement(save);
	    	save.click();
	    }
	}
*/
	
	 
	
	//*********
	

 /*    WebDriver driver;
     public userManagement(WebDriver driver) {
         this.driver = driver;
     }
	WebElement UserMenu=driver.findElement(By.xpath("//*[contains(normalize-space(@class), 'dropdown-menu')]"));
	
	
	public void userMen()
	  {
		Select umenu=new Select(UserMenu);
		umenu.selectByVisibleText("Users management");
		
	  }
	
	public void changepassword()
	{
	WebElement testadmin=driver.findElement(By.xpath("//strong[text()='testadmin']"));
	testadmin.click();
WebElement	ChangePassword=driver.findElement(By.xpath("//*[text()='Change password']"));


	}
}
*/

