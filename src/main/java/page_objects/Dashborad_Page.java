package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import base_class.Base_Class;

public class Dashborad_Page extends Base_Class {
	public Dashborad_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement userAccountNameAfterSignUp() {
		WebElement userAccountNameAfter_SignUp = driver.findElement(By.className("d-none d-lg-block hello"));
		return userAccountNameAfter_SignUp;
	}
}
