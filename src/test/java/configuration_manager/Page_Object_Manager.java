package configuration_manager;

import org.openqa.selenium.WebDriver;
import base_class.Base_Class;
import page_objects.Booking_Page;
import page_objects.Dashborad_Page;
import page_objects.Home_Page;
import page_objects.Search_Page;
import page_objects.Sign_Up_Page;

public class Page_Object_Manager extends Base_Class {
	public WebDriver driver;

	private Sign_Up_Page sup;
	private Home_Page hp;
	private Dashborad_Page dp;
	private Search_Page sp;
	private Booking_Page bp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;

	}

	public Sign_Up_Page get_Instance_SUP() {
		sup = new Sign_Up_Page(driver);
		return sup;

	}

	public Home_Page get_Instance_HP() {
		hp = new Home_Page(driver);
		return hp;

	}

	public Dashborad_Page get_Instance_DP() {
		dp = new Dashborad_Page(driver);
		return dp;

	}

	public Search_Page get_Instance_SP() {
		sp = new Search_Page(driver);
		return sp;
	}

	public Booking_Page get_Instance_BP() {
		bp = new Booking_Page(driver);
		return bp;
	}

}
