package Tests.pkg;

import Commonmethods.Common_methods;
import Commonmethods.Validations;
import Pages.Constants;
import Pages.Dashboard_page;
import Pages.LoginPage;
import Pages.Logout;
import Pages.Playlists_page;
import Pages.Profile_Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Playlists_stepdefinitions {

	@Given("I am at the Audio Digest dashboard page with login as prereqist")
	public void i_am_at_the_audio_digest_dashboard_page_with_login_as_prereqist() throws Exception {
		
			Validations.IsTrue(Common_methods.CurrentUrl(), Constants.HomePageUrl, "home page url is not displayed");
			Profile_Loginpage.profile_login();
			Validations.IsTrue(Common_methods.CurrentUrl(), Constants.LoginPageUrl, "login page url is not displayed");
			LoginPage.enterEmailId(Constants.emailId);
			LoginPage.enterPassword(Constants.password);
			LoginPage.ClickOnLoginBtn();
			Validations.IsTrue(Common_methods.CurrentUrl(), Constants.DashBoardPageUrl, "Dashboard page url is not displayed");
			
	}

	@Given("I click on playlists tab on dashboard page")
	public void i_click_on_playlists_tab_on_dashboard_page() throws Exception 
	{
		Dashboard_page.navigateToPlaylistpage();
	}

	@Given("I validate Audio Digest playlists page")
	public void i_validate_audio_digest_playlists_page() throws Exception 
	{
		Validations.IsTrue(Common_methods.CurrentUrl(),Constants.PlayListUrl,"playlist page url is not displayed");
	}

	@Given("I click on create playlist")
	public void i_click_on_create_playlist() throws Exception 
	{
		Playlists_page.clickOnCreatePlaylist();
	}

	@Given("I validate Audio Digest create playlist popup")
	public void i_validate_audio_digest_create_playlist_popup() throws Exception {
		
		Validations.IsDsiplayed(Playlists_page.playlistTitle(), "create playlist popup is not displayed");
	}

	@Given("enter new playlist name and click on create button")
	public void enter_new_playlist_name_and_click_on_create_button() throws Exception {
		Playlists_page.enterplaylistTextbox();
		Thread.sleep(3000);
		Playlists_page.playlistCreateButton();
		Thread.sleep(3000);

	}

	@Given("I click on any playlist")
	public void i_click_on_any_playlist() throws Exception {
		Playlists_page.clickingAnyPlaylist();
		Thread.sleep(5000);
	}

	@Then("observe the status of that playlist and logout.")
	public void observe_the_status_of_that_playlist_and_logout() throws Exception {
	    Thread.sleep(3000);
	    Logout.clickProfiledrpDown();
	    Thread.sleep(3000);
		Logout.LogoutBtn();
	}

	@Given("I click on Myplaylist group section and validate")
	public void i_click_on_myplaylist_group_section_and_validate() throws Exception 
	{
		Playlists_page.expandMyPlaylist();
		Thread.sleep(5000);
	}

	@Given("I click on AudioDigest playlist group section and validate")
	public void i_click_on_audio_digest_playlist_group_section_and_validate() throws Exception 
	{
		Playlists_page.expandAudioDigestPlaylist();
		Thread.sleep(5000);

	}



	
	





}
