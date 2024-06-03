package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.get("https://fb.com/login");
	}

	@Test(dataProvider = "loginData")
	public void testLogin(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		// Assertions to verify login success or failure
	}

	@DataProvider(name = "loginData")
	public Object[][] getData() {
		return new Object[][] { { "user1", "pass1" }, { "user2", "pass2" }, };
	}

	@AfterMethod
	public void tearDown() {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.quit();
	}
}