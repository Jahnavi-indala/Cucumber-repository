package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static final By emailtextbox =By.xpath("//input[@id='TxtUserName']");

	public static final By passwdtextbox =By.xpath("//input[@id='TxtPassword']");

	public static final By loginbutton=By.xpath("//input[contains(@id,'LbLogin')]");





	public static WebElement EmailTextBox()
	{

		return Driver.getDriver().findElement(emailtextbox);

	}

	public  static WebElement PwdTextBox() 
	{

		return Driver.getDriver().findElement(passwdtextbox);

	}

	public static WebElement LoginButton() 
	{

		return Driver.getDriver().findElement(loginbutton);

	}




	public static void enterEmailId(String emailId) throws Exception {

		Thread.sleep(3000);
		EmailTextBox().sendKeys(emailId);

	}



	public static void enterPassword(String password) throws Exception {

		Thread.sleep(3000);
		PwdTextBox().sendKeys(password);

	}

	public static void ClickOnLoginBtn() throws Exception {

		Thread.sleep(3000);
		LoginButton().click();
		Thread.sleep(3000);
		

	}


}
