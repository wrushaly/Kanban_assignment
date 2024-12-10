package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginWithNewPassword {
    private WebDriver driver;

    // Locators
    private By usernameField = By.xpath("//label[text()='Username']/following-sibling::input");
    private By passwordField = By.xpath("//label[text()='Password']/following-sibling::input");
    private By signInButton = By.xpath("//button[text()='Sign in']");

    // Set up the WebDriver and open the application
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev");
    }

    // Method for logging in with a new password
    public void nLogin(String username, String password) {
        // Locate and interact with the username field
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.clear();
        usernameElement.sendKeys(username);

        // Locate and interact with the password field
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.clear();
        passwordElement.sendKeys(password);

        // Locate and click the sign-in button
        WebElement signInElement = driver.findElement(signInButton);
        signInElement.click();
    }

    // Tear down the WebDriver instance after the test
   
    }






















/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

public class LoginWithNewPassword {
WebDriver driver;
private By usernameField = By.xpath("//label[text()='Username']/following-sibling::input");
private By passwordField = By.xpath("//label[text()='Password']/following-sibling::input");
private By signInButton = By.xpath("//button[text()='Sign in']");

@BeforeMethod
public void setUp() {
    // Initialize WebDriver and open the application
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://kanban.jagadishk.dev");

	 
	public void nLogin (String username; String password)
	{
		
		   
		        driver.findElement(usernameField).sendKeys(username);
		        driver.findElement(passwordField).sendKeys(password);
		        driver.findElement(signInButton).click();
		  
	}	
	
}

}*/