package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Booking_Page extends Base_Class {
	public Booking_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement titleSelection() {
		WebElement title_Selection = driver
				.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[3]/div[1]/div[2]/div/div[2]"));
		return title_Selection;
	}

	public WebElement lastNameForBooking() {
		WebElement lastNameFor_Booking = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		return lastNameFor_Booking;
	}

	public WebElement contactNumberForBooking() {
		WebElement contactNumberFor_Booking = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		return contactNumberFor_Booking;
	}

	public WebElement emailForBooking() {
		WebElement emailFor_Booking = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		return emailFor_Booking;
	}

	public WebElement countryForBooking() {
		WebElement countryFor_Booking = driver
				.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[4]/div[2]/div[2]/div/div[2]"));
		return countryFor_Booking;
	}

	public WebElement cityForBooking() {
		WebElement cityFor_Booking = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		return cityFor_Booking;
	}

	public WebElement iPreferForBooking() {
		WebElement iPreferFor_Booking = driver
				.findElement(By.xpath("//div[contains(text(), 'I prefer not to receive')]"));
		return iPreferFor_Booking;
	}

	public WebElement titleSelectionForPassenger() {
		WebElement titleSelectionFor_Passenger = driver.findElement(
				By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]"));
		return titleSelectionFor_Passenger;
	}

	public WebElement firstNameForPassenger() {
		WebElement firstNameFor_Passenger = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		return firstNameFor_Passenger;
	}

	public WebElement lastNameForPassenger() {
		WebElement lasstNameFor_Passenger = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		return lasstNameFor_Passenger;
	}

	public WebElement mobileNumberForPassenger() {
		WebElement mobileNumberFor_Passenger = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		return mobileNumberFor_Passenger;
	}

	public WebElement dateOfBirthForPassenger() {
		WebElement dateOfBirthFor_Passenger = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		return dateOfBirthFor_Passenger;
	}

	public WebElement nationaltyForPassenger() {
		WebElement dateOfBirthFor_Passenger = driver.findElement(
				By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[4]/div/div[2]/div[2]/div[2]/div/div[2]"));
		return dateOfBirthFor_Passenger;
	}

	public WebElement validduptoPassportForPassenger() {
		WebElement validduptoPassportFor_Passenger = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		return validduptoPassportFor_Passenger;
	}

	public WebElement passportNumberForPassenger() {
		WebElement passportNumberFor_Passenger = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		return passportNumberFor_Passenger;
	}

	public WebElement continueButtonForBooking() {
		WebElement continueButtonFor_Booking = driver.findElement(By.xpath("//div[text()='Continue']"));
		return continueButtonFor_Booking;
	}

	public WebElement firstNameForContact() {
		WebElement firstNameFor_Contact = driver.findElement(By.xpath("(//div[text()='Continue'])[3]"));
		return firstNameFor_Contact;
	}

	public WebElement continueForSecond() {
		WebElement continueFor_Second = driver.findElement(By.xpath("//div[text()='Continue']"));
		return continueFor_Second;
	}

	public WebElement cardNumber() {
		WebElement card_Number = driver.findElement(By.id("card_number"));
		return card_Number;
	}

	public WebElement cardHolderName() {
		WebElement cardHolder_Name = driver.findElement(By.id("name_on_card"));
		return cardHolder_Name;
	}

	public WebElement cardExpiryMonth() {
		WebElement cardExpiry_Month = driver.findElement(By.id("card_exp_month"));
		return cardExpiry_Month;
	}

	public WebElement cardExpiryYear() {
		WebElement cardExpiry_Year = driver.findElement(By.id("card_exp_year"));
		return cardExpiry_Year;
	}

	public WebElement cardSecuritycode() {
		WebElement cardSecurity_code = driver.findElement(By.id("security_code"));
		return cardSecurity_code;
	}

	public WebElement proceedToPay() {
		WebElement proceedTo_Pay = driver.findElement(By.id("//div[text()='Proceed to pay']"));
		return proceedTo_Pay;
	}

	public WebElement paymentconfirmmsg() {
		WebElement paymentconfirm_msg = driver.findElement(By.id(""));
		return paymentconfirm_msg;
	}
}
