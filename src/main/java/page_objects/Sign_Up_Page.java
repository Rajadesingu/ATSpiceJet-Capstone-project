package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import base_class.Base_Class;

public class Sign_Up_Page extends Base_Class {
	public Sign_Up_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement titleSelection() {
		WebElement title_Selection = driver.findElement(By.xpath("//option[text()='Select an option']"));
		return title_Selection;
	}

	public WebElement firstNameForSignUp() {
		WebElement firstNameFor_SignUp = driver.findElement(By.id("first_name"));
		return firstNameFor_SignUp;
	}

	public WebElement lastNameForSignUp() {
		WebElement lastNameFor_SignUp = driver.findElement(By.id("last_name"));
		return lastNameFor_SignUp;
	}

	public WebElement countrySelection() {
		WebElement country_Selection = driver.findElement(By.xpath("//option[text()='select country']"));
		return country_Selection;
	}

	public WebElement dateSelection() {
		WebElement date_Selection = driver.findElement(By.id("dobDate"));
		return date_Selection;
	}

	public WebElement mobileNumberForSignUp() {
		WebElement mobileNumberFor_SignUp = driver.findElement(By.className(" form-control"));
		return mobileNumberFor_SignUp;
	}

	public WebElement emailIdForSignUp() {
		WebElement emailIdFor_SignUp = driver.findElement(By.id("email_id"));
		return emailIdFor_SignUp;
	}

	public WebElement passwaordForSignUp() {
		WebElement passwaordFor_SignUp = driver.findElement(By.id("new-password"));
		return passwaordFor_SignUp;
	}

	public WebElement confirmPasswaordForSignUp() {
		WebElement confirmPasswaordFor_SignUp = driver.findElement(By.id("c-password"));
		return confirmPasswaordFor_SignUp;
	}

	public WebElement iAgreeForSignUp() {
		WebElement iAgreeFor_SignUp = driver.findElement(By.id("defaultCheck1"));
		return iAgreeFor_SignUp;
	}

	public WebElement submitForSignUp() {
		WebElement submitFor_SignUp = driver.findElement(By.xpath("//button[text()='Submit']"));
		return submitFor_SignUp;
	}
}
