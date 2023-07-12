package Commonmethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Pages.Driver;
import Pages.Library_page;


public class Common_methods {


	public void DragAndDrop(WebElement source, WebElement target) {

		Actions action = new Actions(Driver.getDriver());

		action.dragAndDrop(source,target).build().perform();

	}


	public void ImplicitWait() {

		Driver.getDriver().manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));

	}


	public static String getTitle() {

		return Driver.getDriver().getTitle();

	}

	public void ClickOnAlert(String option) {

		Alert alert = Driver.getDriver().switchTo().alert();

		if (option.equals("ok"))

			alert.accept();

		else if (option.equals("cancel"))

			alert.dismiss();

	}

	public static String CurrentUrl() 
	{

		System.out.println(Driver.getDriver().getCurrentUrl());

		return Driver.getDriver().getCurrentUrl();

	}

	public static void 	close() {

		Driver.getDriver().close();

	}

	public static void selectDropDown(WebElement element,String selecttext)
	{

		Select s=new Select(element);
		s.selectByVisibleText(selecttext);

	}

	public static String clickSearchMenuAndTypeOption(String Xpath,String option)
	{

		return String.format(Xpath,option);
	}
	public static void selectSpecialtyByDropdown() throws Exception
	{


		Thread.sleep(3000);
		System.out.println(Common_methods.clickSearchMenuAndTypeOption(Library_page.selectspecality,"Orthopaedics"));
		WebElement s=Driver.getDriver().findElement(By.xpath(Common_methods.clickSearchMenuAndTypeOption(Library_page.selectspecality,"Orthopaedics")));
		s.click();

	}

}





