package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Searchoptions_page {

	public static final By enterOnSearchBox=By.xpath("//input[@id='header_0_txtKeywordsTop']");
	public static final By clickSearchIcon=By.xpath("//a[@id='header_0_btnSearchTop']"); 
	public static final By enterOntopicFilter=By.xpath("//input[@id='container_2_racbTopic_Input']");
	
	
	public static final By clickSearchResultCrossIconBtn=By.xpath("//input[@id=\"container_2_rptKeywords_btoRemove_0\"]");
	public static final By institutionTextBox=By.xpath("//input[@id=\"container_2_racbInstitution_Input\"]");
	
	
	
	
	
	
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
	public static WebElement clickOnSearchResCrossBtn() 
	{
		return Driver.getDriver().findElement(clickSearchResultCrossIconBtn);

	}
	public static WebElement enterInstituteTextBox() 
	{
		return Driver.getDriver().findElement(institutionTextBox);

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
	public static void enterTextOnTopicFilter() throws Exception
	{

		textOnTopicFilter().sendKeys(Constants.typeOfDisease);;
		Thread.sleep(10000);

	}
	public static void clickOnSearchResultCrossBtn() throws Exception
	{

		clickOnSearchResCrossBtn().click();
		Thread.sleep(3000);

	}
	public static void enterInstitutionNameInTextBox() throws Exception
	{

		clickOnSearchResCrossBtn().sendKeys(Constants.instituteName);;
		Thread.sleep(3000);

	}
}
