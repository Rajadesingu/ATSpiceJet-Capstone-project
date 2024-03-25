package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Home_Page extends Base_Class {
	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement signUpMenu() {
		WebElement clickSignIn = driver.findElement(By.xpath("//div[text()='Signup']"));
		return clickSignIn;
	}

	public WebElement loginMenu() {
		WebElement clickSignIn = driver.findElement(By.xpath("//div[text()='Login']"));
		return clickSignIn;
	}

	public WebElement mobileNumberForLogin() {
		WebElement mobileNumberFor_Login = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		return mobileNumberFor_Login;
	}

	public WebElement passwordForLogin() {
		WebElement passwordFor_Login = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		return passwordFor_Login;
	}

	public WebElement loginButton() {
		WebElement login_Button = driver.findElement(By.xpath("//div[text()='LOGIN']"));
		return login_Button;
	}

	public WebElement userAccountNameForLogin() {
		WebElement userAccountNameFor_Login = driver
				.findElement(By.className("css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa"));
		return userAccountNameFor_Login;
	}

	public WebElement oneWayRadioButton() {
		WebElement oneWayRadio_Button = driver.findElement(By.xpath("//div[text()='one way']"));
		return oneWayRadio_Button;
	}

	public WebElement roundTripRadioButton() {
		WebElement roundTripRadio_Button = driver.findElement(By.xpath("//div[text()='round trip']"));
		return roundTripRadio_Button;
	}

	public WebElement fromsearchdestination() {
		WebElement fromsearch_destination = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		return fromsearch_destination;
	}

	public WebElement tosearchdestination() {
		WebElement tosearch_destination = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		return tosearch_destination;
	}

	public WebElement departureDate() {
		WebElement departure_Date = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]"));
		return departure_Date;
	}

	public WebElement returnDate() {
		WebElement return_Date = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[2]/div[1]"));
		return return_Date;
	}

	public WebElement passengersCount() {
		WebElement passengers_Count = driver.findElement(By.xpath("//div[text()='Passengers']"));
		return passengers_Count;
	}

	public WebElement currency() {
		WebElement currency = driver.findElement(By.xpath("//div[text()='currency']"));
		return currency;
	}

	public WebElement familyAndFriends() {
		WebElement familyAnd_Friends = driver.findElement(By.xpath("//div[text()='Family & Friends']"));
		return familyAnd_Friends;
	}

	public WebElement searchFlight() {
		WebElement search_Flight = driver.findElement(By.xpath("//div[text()='Search Flight']"));
		return search_Flight;
	}

	public WebElement addPassengers() {
		WebElement add_Passengers = driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]"));
		return add_Passengers;
	}

	public WebElement checkInButton() {
		WebElement checkIn_Button = driver.findElement(By.xpath("//div[text()='check-in']"));
		return checkIn_Button;
	}

	public WebElement flightStatusButton() {
		WebElement flightStatus_Button = driver.findElement(By.xpath("//div[text()='flight status']"));
		return flightStatus_Button;
	}

	public WebElement manageBookingButton() {
		WebElement manageBooking_Button = driver.findElement(By.xpath("//div[text()='manage booking']"));
		return manageBooking_Button;
	}

	public WebElement PNR_Number() {
		WebElement PNR_Number = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		return PNR_Number;
	}

	public WebElement emailForCheckIn() {
		WebElement emailFor_CheckIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		return emailFor_CheckIn;
	}

	public WebElement searchBookingButton() {
		WebElement searchBooking_Button = driver.findElement(By.xpath("//div[text()='Search Booking']"));
		return searchBooking_Button;
	}

	public WebElement departureDateForFlightStatus() {
		WebElement departureDateForFlight_Status = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]"));
		return departureDateForFlight_Status;
	}

	public WebElement fromForFlightStatus() {
		WebElement fromForFlight_Status = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		return fromForFlight_Status;
	}

	public WebElement toForFlightStatus() {
		WebElement toForFlight_Status = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		return toForFlight_Status;
	}

	public WebElement flightNoForFlightStatus() {
		WebElement flightNoForFlight_Status = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		return flightNoForFlight_Status;
	}

	public WebElement searchFlightButtonForFlightStatus() {
		WebElement searchFlightButtonFor_FlightStatus = driver.findElement(By.xpath("//div[text()='Search Flights']"));
		return searchFlightButtonFor_FlightStatus;
	}

	public WebElement flightStatus() {
		WebElement flight_Status = driver.findElement(By.xpath("//div[text()='Flight Status:']"));
		return flight_Status;
	}

}
