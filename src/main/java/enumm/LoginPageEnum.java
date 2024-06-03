package enumm;

import org.openqa.selenium.By;

public enum LoginPageEnum {
	USERNAME(By.id("email")), PASSWORD(By.id("pass")), LOGIN_BUTTON(By.id("u_0_5_6H")),

	private By locator;

	LoginPageEnum(By id) {
		// TODO Auto-generated constructor stub
		this.locator = locator;
	}

	public By getLocator() {
		return locator;
	}
}