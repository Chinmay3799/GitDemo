package Page;

import org.openqa.selenium.WebDriver;

import enumm.LoginPageEnum;
import resources.base;

public class LoginPage extends base {
	public LoginPage(WebDriver driver) {
		super();
	}

	public void enterUsername(String username) {
		driver.findElement(LoginPageEnum.USERNAME.getLocator()).sendKeys("user");
	}

	public void enterPassword(String password) {
		driver.findElement(LoginPageEnum.PASSWORD.getLocator()).sendKeys("user");

	}

	public void clickLoginButton() {
		driver.findElement(LoginPageEnum.LOGIN_BUTTON.getLocator()).click();

	}

}
