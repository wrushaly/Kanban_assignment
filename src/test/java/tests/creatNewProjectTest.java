package tests;

import org.openqa.selenium.WebDriver;

import pages.creatNewProject;

public class creatNewProjectTest {
	
	
public WebDriver driver;

public void newProj()
{
	creatNewProject newPRO= new creatNewProject(driver);
	newPRO.toNavigateNewProject();
	newPRO.creatProject("test project" , "TP" );
	newPRO.prmission("testmanager" , "project manager" );
	newPRO.prmission("testuser", " Project Member" );
	newPRO.prmission("testviewer", " Project Viewer" );
}


}
