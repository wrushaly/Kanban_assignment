package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class failedLogin {
    private WebDriver driver;

    // Locators
    private By usernameFieldLocator = By.xpath("//label[text()='Username']/following-sibling::input");
    private By passwordFieldLocator = By.xpath("//label[text()='Password']/following-sibling::input");
    private By signInButtonLocator = By.xpath("//button[text()='Sign in']");
    private By errorMessageLocator = By.id("error-alert");

    // Constructor
    public failedLogin(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for interactions
    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(usernameFieldLocator);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignIn() {
        WebElement signInButton = driver.findElement(signInButtonLocator);
        signInButton.click();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(errorMessageLocator);
        return errorMessage.getText();
    }
}


























//public class failedLogin {
/*public WebDriver driver ;

WebElement usernameField = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
WebElement passwordField = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));


public void driverInitialisation()
	{
		driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kanban.jagadishk.dev/login");
	
	}
	
	public void credentials()
	{
		
        usernameField.sendKeys("testadmin");

        passwordField.click();  
        passwordField.sendKeys("xyz");
        
      signInButton.click();
      
      WebElement errorMessage = driver.findElement(By.id("error-alert"));
      String errorMsg=errorMessage.getText();
      System.out.println(errorMsg);
      
     }
	
	public void driverclose()
	{
		driver.quit();
	}
	
	

}

*/
