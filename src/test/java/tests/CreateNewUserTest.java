package tests;

import org.openqa.selenium.WebDriver;

import pages.CreateNewUser;

public class CreateNewUserTest {
public WebDriver driver;

public void testmanager()
{
   CreateNewUser crUser=new CreateNewUser(driver);
   crUser.navigateToUsersManagement();
   crUser.createUser("testmanager" , "manager" ,"testmanager");
   crUser.createUser("testuser" , "User" ,"testuser");
   crUser.createUser("testviewer" , "user" ,"testviewer");
}
	
}



/*
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateNewUser;

public class CreateNewUserTest {
    private WebDriver driver;
    private CreateNewUser createNewUser;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kanban.jagadishk.dev");
        createNewUser = new CreateNewUser(driver);
    }

    @Test
    public void testCreateManagerUser() {
        createNewUser.navigateToUsersManagement();
        createNewUser.createUser("testmanager", "Manager", "TestManager123");
    }

    @Test
    public void testCreateNormalUser() {
        createNewUser.navigateToUsersManagement();
        createNewUser.createUser("testuser", "User", "TestUser123");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
*/