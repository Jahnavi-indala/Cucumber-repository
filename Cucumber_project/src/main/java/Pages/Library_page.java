package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Library_page {

	public static final By addtoPlaylistBy=By.xpath("//a[contains(@id,'container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton')]");
	public static final By playlistPopupTitle=By.xpath("//span[text()='This course is in your Library ']");
    public static final By createPlaylistTxtbox=By.xpath("//input[@placeholder='Create new playlist']");
	public static final By clickOnSaveBtn=By.xpath("//input[@id='submitbutmodal']");
	
	
	
	
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
		
}
