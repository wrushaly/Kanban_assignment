package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By usernameField = By.xpath("//label[text()='Username']/following-sibling::input");
    private By passwordField = By.xpath("//label[text()='Password']/following-sibling::input");
    private By signInButton = By.xpath("//button[text()='Sign in']");

    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to perform login
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signInButton).click();
    }
}
