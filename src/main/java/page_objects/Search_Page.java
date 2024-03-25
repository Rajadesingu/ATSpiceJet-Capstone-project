package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Search_Page extends Base_Class {
	public Search_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement availableFlightForSearchResult() {
		WebElement availableFlightForSearch_Result = driver.findElement(By.xpath("//div[text()='Departs']"));
		return availableFlightForSearch_Result;
	}

	public WebElement selectFlight() {
		WebElement select_Flight = driver
				.findElement(By.xpath("//*[@id=\"list-results-section-0\"]/div[5]/div/div/div[2]/div[1]/div/div/div"));
		return select_Flight;
	}

	public WebElement cotinueButton() {
		WebElement cotinue_Button = driver.findElement(By.xpath("(//div[text()='Continue'])[1]"));
		return cotinue_Button;
	}
}
