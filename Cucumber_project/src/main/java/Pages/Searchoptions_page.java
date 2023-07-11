package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Searchoptions_page {

	public static final By enterOnSearchBox=By.xpath("//input[@id='header_0_txtKeywordsTop']");
	public static final By clickSearchIcon=By.xpath("//i[@class='fa fa-search']"); 
	public static final By enterOntopicFilter=By.xpath("//input[@id='container_2_racbTopic_Input']");
	
	
	
	
	
	
	
	public static WebElement textOnSearchBox() 
	{
		return Driver.getDriver().findElement(enterOnSearchBox);

	}
	public static WebElement clickOnSearchIconBtn() 
	{
		return Driver.getDriver().findElement(clickSearchIcon);

	}
	public static WebElement textOnTopicFilter() 
	{
		return Driver.getDriver().findElement(enterOntopicFilter);

	}
	
	
	
	
	
	
	
	
	public static void enterTextOnSearchBox() throws Exception
	{

		textOnSearchBox().sendKeys(Constants.coursename);
		Thread.sleep(3000);

	}
	public static void clickOnSearchIconButton() throws Exception
	{

		clickOnSearchIconBtn().click();
		Thread.sleep(3000);

	}
}
