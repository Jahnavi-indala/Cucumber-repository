package Tests.pkg;

import Commonmethods.Common_methods;
import Commonmethods.Validations;
import Pages.Constants;
import Pages.LoginPage;
import Pages.Logout;
import Pages.Profile_Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage_stepdefinitions {


	@Given("I am at the Audio Digest Home page and validate")
	public void i_am_at_the_audio_digest_home_page_and_validate() throws Exception 
	{
		Validations.IsTrue(Common_methods.CurrentUrl(),Constants.HomePageUrl,"Home page is not displayed" );

	}

	@Given("I click the Login profile and validate")
	public void i_click_the_login_profile_and_validate() throws Exception {
		Profile_Loginpage.profile_login();
		Validations.IsTrue(Constants.LoginPageUrl, Common_methods.CurrentUrl(), " loginpage is not displayed");
	}

	@Given("enter the username")
	public void enter_the_username() throws Exception 
	{
		LoginPage.enterEmailId(Constants.emailId);

	}

	@Given("enter the password")
	public void enter_the_password() throws Exception
	{
		LoginPage.enterPassword(Constants.password);

	}

	@Given("I will click the Login button")
	public void i_will_click_the_login_button() throws Exception {
		LoginPage.ClickOnLoginBtn();
	}

	@Given("I validate the outcome dashboard page")
	public void i_validate_the_outcome_dashboard_page() throws Exception {
		Validations.IsTrue(Common_methods.CurrentUrl(), Constants.DashBoardPageUrl ,"Dashboardpage is not displayed" );
	}

	@Then("logout.")
	public void logout() throws Exception
	{
		Logout.clickProfiledrpDown();
		Logout.LogoutBtn();
	}





}
