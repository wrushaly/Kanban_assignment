package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev/login");

        // Initialize the LoginPage object
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        // Perform login action
        loginPage.login("testadmin", "xyz");
        
        // Add assertions to validate test results
        // Example: Assert that the user is redirected to the correct page
        // Assert.assertEquals(driver.getCurrentUrl(), "https://kanban.jagadishk.dev/dashboard");
    }

    @AfterMethod
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
