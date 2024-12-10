package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginWithNewPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithNewPasswordTest {
    private WebDriver driver;

    LoginWithNewPassword loPage = new LoginWithNewPassword(); 
    // Set up the WebDriver and initialize the page object
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev");
       // Initialize the page class
    }

    // Test for logging in with a new password
    @Test
    public void testLoginWithValidNewPassword() {
        // Test data
        String username = "testadmin";
        String newPassword = "StrongP@ssw0rd123";

        // Perform login using the new password
        loPage.nLogin(username, newPassword);

        // Add assertions to validate successful login (e.g., verify the presence of a specific element)
        // Example: Validate if dashboard or logout button is visible
        // Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed(), "Login failed or dashboard not visible");
    }

    // Tear down the WebDriver after the test
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

