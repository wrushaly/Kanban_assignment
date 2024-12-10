package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class creatNewProject {
	
	
	public WebDriver driver;
	  private By userMenuLocator = By.xpath("//*[@class='avatar avatar-20 avatar-inline']");
	 private By dashBordLocator = By.xpath("//*[@title='Dashboard']");
	 private By newProjectLocator = By.xpath("(//*[text()='New project'])[1]");
	 private By frame1Locator = By.xpath("//*[@id='project-creation-form']");
	 private By nameLocator = By.xpath("//*[@name='name']");
	 private By identifierLocator = By.xpath("//*[@name='identifier']");
	 private By saveLocator = By.xpath("//*[@type='submit']");
	private By permissionLocator = By.xpath("//a[@href='/project/27/permissions']");
     private By nameFrPrmisionLocator = By.xpath("(//*[@id='form-name'])[1]");
	
     private By rolePrmisionLocator = By.xpath("(//*[@id='form-role'])[1]");
	 private By addPrmisionLocator = By.xpath("(//*[@type='submit'])[1]");
	 private By LogoutLocator = By.xpath("(//*[text()='Logout'])[2]");
	 
	 public creatNewProject(WebDriver driver) {
	        this.driver = driver;
	    }

	  
	       
	    
	 public void toNavigateNewProject()
	 {
		 driver.findElement(dashBordLocator).click();
	        driver.findElement(newProjectLocator).click();
	     
	      
	        WebElement frame1=driver.findElement(frame1Locator);
	       driver.switchTo().frame(frame1);
	      
	 }
	   
	 public void creatProject(String proName , String id  )
	 {
		 driver.findElement(nameLocator).sendKeys(proName);
		 driver.findElement(identifierLocator).sendKeys(id);
		 driver.findElement(saveLocator);
	 }
		 
	 public void prmission(String name , String rolle )
	 {
		 driver.findElement(permissionLocator).click();
		 driver.findElement(nameFrPrmisionLocator).sendKeys(name);
		
		 driver.findElement(rolePrmisionLocator).click();
		 WebElement rolleDrop=driver.findElement(rolePrmisionLocator);
		 new Select(rolleDrop).selectByVisibleText(rolle);
		 
		 driver.findElement(addPrmisionLocator);
		 
		
	 }
	 
	 public void logout()
	    {
	    	 WebElement userMenu = driver.findElement(userMenuLocator);
	         userMenu.click();
	         WebElement Logout = driver.findElement(LogoutLocator);
		        Logout.click();
	    }
}
