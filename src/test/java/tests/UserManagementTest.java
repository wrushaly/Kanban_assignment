package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UserManagement;

public class UserManagementTest {
    private WebDriver driver;
    private UserManagement userManagement;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver and open the application
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev");

        // Initialize the UserManagement page object
        userManagement = new UserManagement(driver);
    }

    @Test
    public void testChangePassword() {
        // Step 1: Open User Menu
        userManagement.openUserMenu();

        // Step 2: Select "Users Management" from the dropdown
        userManagement.selectUsersManagement();

        // Step 3: Navigate to the Change Password section
        userManagement.navigateToChangePassword();

        // Step 4: Change password to a new strong password
        String currentPassword = "Testadmin123"; // Replace with your actual current password
        String newPassword = "StrongP@ssw0rd123"; // Replace with your strong password
        userManagement.changePassword(currentPassword, newPassword);

        // Step 5: Add an assertion to verify if the password change was successful
        boolean isPasswordChanged = driver.findElements(By.xpath("//*[contains(text(), 'Password changed successfully')]")).size() > 0;
        Assert.assertTrue(isPasswordChanged, "Password change was not successful!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after test execution
        if (driver != null) {
            driver.quit();
        }
    }
}


