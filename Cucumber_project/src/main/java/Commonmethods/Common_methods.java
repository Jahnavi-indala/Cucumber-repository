package Commonmethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Pages.Driver;


public class Common_methods {

	
	public void DragAndDrop(WebElement source, WebElement target) {

		Actions action = new Actions(Driver.getDriver());

		action.dragAndDrop(source,target).build().perform();
   
	}


	public void ImplicitWait() {

		Driver.getDriver().manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));

	}


	public String getTitle() {

		return Driver.getDriver().getTitle();

	}

	public void ClickOnAlert(String option) {

		Alert alert = Driver.getDriver().switchTo().alert();

		if (option.equals("ok"))

			alert.accept();

		else if (option.equals("cancel"))

			alert.dismiss();

	}

	public static String CurrentUrl() {
		
		System.out.println(Driver.getDriver().getCurrentUrl());

		return Driver.getDriver().getCurrentUrl();

	}

	public static void 	close() {

		Driver.getDriver().close();

	}

}





