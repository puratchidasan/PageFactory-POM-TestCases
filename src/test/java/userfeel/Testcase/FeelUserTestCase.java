package userfeel.Testcase;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.userfeel.HomePage;
import reusable.methods.CommonClass;

public class FeelUserTestCase extends CommonClass {	
	
	//public RemoteWebDriver driver;
	
	@Test
	@Feature("UserFree Functionality")
	@Severity(SeverityLevel.CRITICAL)
	public void executeTestcase() throws IOException{
		
		File fileToDelete = new File("./Screenshot");
		purgeDirectory(fileToDelete);
		
		new HomePage(driver)
		.clickOnLogonIcon()
		.enterUserId("dummy123@gmail.com")
		.enterPassword("dummy123")
		//.pageDown()
		.clickOnTester()
		.pageDown()
		.clickOnTwitterIcon()
		.switchToTwitterPage()
		.clickOnTwitterLogin()
		.enterTheUserid()
		.enterThePasswrod()
		.switchToHomePage();	
		
	}

	public static void purgeDirectory(File dir) {
		for (File file : dir.listFiles()) {
			if (file.isDirectory())
				purgeDirectory(file);
			file.delete();
		}
	}
}
