package Tests.pkg;

import Commonmethods.Common_methods;
import Commonmethods.Validations;
import Pages.Constants;
import Pages.Dashboard_page;
import Pages.Library_page;
import io.cucumber.java.en.Given;

public class Librarypage_stepdefinitions {

	@Given("I click on library tab on dashboard page")
	public void i_click_on_library_tab_on_dashboard_page() throws Exception
	{
		Dashboard_page.navigatetoLibrary();
	}

	@Given("I validate Audio Digest library page")
	public void i_validate_audio_digest_library_page() throws Exception 
	{
		Validations.IsTrue(Common_methods.CurrentUrl(), Constants.libraryUrl, "Librarypage is not displayed");
	}

	@Given("I click on add to playlist link on any playlist")
	public void i_click_on_add_to_playlist_link_on_any_playlist() throws Exception
	{
		Library_page.addToPlaylist();
	}

	@Given("validate displayed popup")
	public void validate_displayed_popup() throws Exception 
	{
		Validations.IsDsiplayed(Library_page.popupTitleOfPlaylist(), "course add to playlist popup is not displayed");
	}

	@Given("click on save button and observe the popup message")
	public void click_on_save_button_and_observe_the_popup_message() throws Exception 
	{
		Library_page.clickOnSaveBtnOnPopup();
	}

	@Given("I click on add to playlist link and validate displayed popup")
	public void i_click_on_add_to_playlist_link_and_validate_displayed_popup() {
	   
	}

	@Given("I click on close button on popup and validate")
	public void i_click_on_close_button_on_popup_and_validate() {
	   
	}

	@Given("enter the playlist name in the textbox and click on save button")
	public void enter_the_playlist_name_in_the_textbox_and_click_on_save_button() {
	    
	}

	@Given("validate display popup and dismiss popup")
	public void validate_display_popup_and_dismiss_popup() {
	    
	}



}
