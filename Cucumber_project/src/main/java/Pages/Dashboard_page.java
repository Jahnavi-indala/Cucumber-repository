package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commonmethods.Validations;

public class Dashboard_page {

	public static final By PlaylistsTab=By.xpath("//span[text()='Playlists']");
	public static final By dashboardTab=By.xpath("//span[text()='Dashboard']");
	public static final By LibraryTab=By.xpath("//span[text()='Library']");





	public static WebElement PlaylistTab() 
	{
		return Driver.getDriver().findElement(PlaylistsTab);

	}
	public static WebElement dashboardBtn() 
	{

		return Driver.getDriver().findElement(dashboardTab);

	}
	public static WebElement LibraryTab() 
	{

		return Driver.getDriver().findElement(LibraryTab);

	}
	






	public static void navigateToPlaylistpage() throws Exception
	{

		PlaylistTab().click();
		Thread.sleep(3000);

	}
	public static void  NavigatetoDashboard() throws Exception 
	{
		dashboardBtn().click();
		Thread.sleep(5000);

	}
	public static void  navigatetoLibrary() throws Exception 
	{
		LibraryTab().click();
		Thread.sleep(5000);

	}

	

}




