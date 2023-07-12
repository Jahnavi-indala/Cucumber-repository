package Tests.pkg;

import Commonmethods.Common_methods;
import Pages.Profile_Loginpage;
import io.cucumber.java.en.Given;

public class Profilepage_stepdeinitions {

	@Given("I click on the User profile and verify the dropdown")
	public void i_click_on_the_user_profile_and_verify_the_dropdown() throws Exception {
		Profile_Loginpage.clickProfileDropdown();
		Thread.sleep(3000);
	}

	@Given("click the My information and verify all contact informations")
	public void click_the_my_information_and_verify_all_contact_informations() throws Exception {
		Profile_Loginpage.clickMyInformationFromProfileDrpdwn();
		Thread.sleep(3000);
	}


	
	
}
