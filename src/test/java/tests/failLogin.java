package tests;

import pages.failedLogin;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class failLogin {
    private WebDriver driver;
    private failedLogin failedLoginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev/login");

        // Initialize the page class
        failedLoginPage = new failedLogin(driver);
    }

    @Test
    public void testFailedLogin() {
        failedLoginPage.enterUsername("testadmin");
        failedLoginPage.enterPassword("xyz");
        failedLoginPage.clickSignIn();

        // Verify the error message
        String errorMsg = failedLoginPage.getErrorMessage();
        System.out.println("Error Message: " + errorMsg);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


