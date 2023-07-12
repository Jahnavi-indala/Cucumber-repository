package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commonmethods.Common_methods;

public class Library_page {

	public static final By addtoPlaylistBy=By.xpath("//a[contains(@id,'container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton')]");
	public static final By playlistPopupTitle=By.xpath("//span[text()='This course is in your Library ']");
    public static final By createPlaylistTxtbox=By.xpath("//input[@placeholder='Create new playlist']");
	public static final By clickOnSaveBtn=By.xpath("//input[@id='submitbutmodal']");
	public static final By closePopup=By.xpath("//a[@ng-click='Close()']");
	public static final By popupTextbox=By.xpath("//input[@placeholder='Create new playlist']");
	public static final By popupMsgg=By.xpath("//div[text()='The lecture has been succesfully added.']");
	public static final By clickSearchBySpecialty=By.xpath("//a[text()='Search By Specialty ']");
	public static final By selectSpeciatly=By.id("header_0_rpSearchSpecialty_btoSearchLink_14");
	public static final By selectSortByDP=By.xpath("//select[@id='container_2_ddlSortingBy']");
	public static final String selectspecality="//a[text()='Search By Specialty '] /parent::div//div/a[text()='%s']";
	
	
	
	public static WebElement addPlaylist() 
	{
		return Driver.getDriver().findElement(addtoPlaylistBy);

	}
	public static WebElement popupTitleOfPlaylist() 
	{
		return Driver.getDriver().findElement(playlistPopupTitle);

	}
	public static WebElement playlistTextBox() 
	{
		return Driver.getDriver().findElement(createPlaylistTxtbox);

	}
	public static WebElement clickOnSaveBtn() 
	{
		return Driver.getDriver().findElement(clickOnSaveBtn);

	}
	public static WebElement clickOnClosePopup() 
	{
		return Driver.getDriver().findElement(closePopup);

	}
	public static WebElement popupTextBox() 
	{
		return Driver.getDriver().findElement(popupTextbox);

	}
	public static WebElement popupMessage() 
	{
		return Driver.getDriver().findElement(popupMsgg);

	}
	public static WebElement clickSearchSpecialty() 
	{
		return Driver.getDriver().findElement(clickSearchBySpecialty);

	}
	public static WebElement clickSelectSpecialty() 
	{
		return Driver.getDriver().findElement(selectSpeciatly);

	}
	public static WebElement selectSortByDrpdwn() 
	{
		return Driver.getDriver().findElement(selectSortByDP);

	}
	
	
	
	
	
	
	
	
	
	public static void addToPlaylist() throws Exception
	{

		addPlaylist().click();
		Thread.sleep(3000);

	}
	public static void createPlaylistTextbox() throws Exception
	{

		playlistTextBox().click();
		Thread.sleep(3000);

	}
	public static void clickOnSaveBtnOnPopup() throws Exception
	{

		clickOnSaveBtn().click();
		Thread.sleep(3000);

	}
	public static void clickPopupCloseBtn() throws Exception
	{

		clickOnClosePopup().click();
		Thread.sleep(3000);

	}
	public static void enterPopupTextBox() throws Exception
	{

		popupTextBox().sendKeys(Constants.playlistTextboxpopup);
		Thread.sleep(3000);

	}
	public static void clickOnSearchBySpecialty() throws Exception
	{

		clickSearchSpecialty().click();
		Thread.sleep(3000);

	}
	
	

		
}
