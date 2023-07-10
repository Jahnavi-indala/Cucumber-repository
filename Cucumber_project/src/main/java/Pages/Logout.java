package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commonmethods.Validations;

public class Logout {


	public static final By ProfileDrpDwnBtnBy=By.xpath("//div[@id='loginSection']");

	public static final By ProfileDrpDwnListVdtBy=By.xpath("//ul[@id='drop1']");

	public static final By LogoutButtonBy=By.xpath("//a[text()='Logout']");





	public static WebElement ProfileDrpDwnBtn() 
	{

		return Driver.getDriver().findElement(ProfileDrpDwnBtnBy);

	}

	public static WebElement ProfileDrpDwnListVdt() 
	{

		return Driver.getDriver().findElement(ProfileDrpDwnBtnBy);

	}



	public static WebElement LogoutButton()
	{

		return Driver.getDriver().findElement(LogoutButtonBy);

	}







	public static void clickProfiledrpDown() throws Exception
	{

		ProfileDrpDwnBtn().click();
		Validations.IsDsiplayed(ProfileDrpDwnListVdt(), "profile dropdown list is not displayed");

	}



	

	public static void LogoutBtn() throws Exception 
	{	

		LogoutButton().click();

	}




}
