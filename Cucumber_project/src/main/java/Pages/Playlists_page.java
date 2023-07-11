package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commonmethods.Validations;

public class Playlists_page {


	public static final By CreatePlaylistBtn = By.xpath("//a[@title='Create playlist']");
	public static final By CPpopupTitle=By.xpath("//span[text()='Create Playlist']");
	public static final By CPTextbox=By.xpath("//input[@id='txtPlaylistName']");
    public static final By CreateButton=By.xpath("//input[@value='CREATE']");
    public static final By playlistPopupTitle=By.xpath("//div[@id=\"CreateModal\"]/span");
    public static final By ClickAnyPlaylist=By.xpath("//a[@class='ng-binding']//span[text()='Oncology']");
    public static final By ClickMyPlaylistTab=By.xpath("//a[@id='lnkMPCM']");
    public static final By ClickAudioDigestPlaylistTab=By.xpath("//a[@id='lnkByADCM']");
    
    
	//web elements
	public static WebElement createPlaylistBtn()
	{

		return Driver.getDriver().findElement(CreatePlaylistBtn);

	}
	
	public static WebElement createPlaylistPopupTitle()
	{

		return Driver.getDriver().findElement(CPpopupTitle);

	}
	public static WebElement playlistTextBox()
	{

		return Driver.getDriver().findElement(CPTextbox);

	}
	public static WebElement playlistCreateBtn()
	{

		return Driver.getDriver().findElement(CreateButton);

	}
	public static WebElement playlistTitle()
	{

		return Driver.getDriver().findElement(playlistPopupTitle);

	}
	public static WebElement clickOnPlaylist()
	{

		return Driver.getDriver().findElement(ClickAnyPlaylist);

	}
	public static WebElement clickOnMyPlaylist()
	{

		return Driver.getDriver().findElement(ClickMyPlaylistTab);

	}
	public static WebElement clickOnAudioDigestPlaylist()
	{

		return Driver.getDriver().findElement(ClickAudioDigestPlaylistTab);

	}

	
	
	
	
	
	//action
	public static void clickOnCreatePlaylist() throws Exception
	{
		createPlaylistBtn().click();
		Thread.sleep(3000);
	}
	public static void CPlaylistPopupTitle() throws Exception
	{
		createPlaylistPopupTitle().click();
		Thread.sleep(3000);
	}
	public static void enterplaylistTextbox() throws Exception
	{
		playlistTextBox().sendKeys(Constants.newplaylistname);
		Thread.sleep(3000);
	}
	public static void playlistCreateButton() throws Exception
	{
		playlistCreateBtn().click();
		Thread.sleep(3000);
	}
	
	public static void clickingAnyPlaylist() throws Exception
	{
		clickOnPlaylist().click();
		Thread.sleep(3000);
	}
	public static void expandMyPlaylist() throws Exception
	{
		clickOnMyPlaylist().click();
		Thread.sleep(3000);
	}
	public static void expandAudioDigestPlaylist() throws Exception
	{
		clickOnAudioDigestPlaylist().click();
		Thread.sleep(3000);
	}
	
	
	
	
}
