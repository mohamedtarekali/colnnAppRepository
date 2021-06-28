package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import pages.DashBoardPage;
import pages.LibraryPage;

public class AddLibraryTest extends TestBase {
	
	DashBoardPage dashBoardPageObject;
	LibraryPage libraryPageObject;
	
	@Test
	public void userCanAddLibrary() {
		dashBoardPageObject=new DashBoardPage(driver);
		dashBoardPageObject.userOpenLibraryFromDashBoard();
		libraryPageObject=new LibraryPage(driver);
		libraryPageObject.userAddLibrary();
		
	}

}
