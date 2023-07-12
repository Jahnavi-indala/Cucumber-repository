package Tests.pkg;

import Commonmethods.Common_methods;
import Commonmethods.Validations;
import Pages.Constants;
import Pages.Searchoptions_page;
import io.cucumber.java.en.Given;

public class SearchOperations_stepdefinitions {

	
	@Given("enter coursename on searchbox and validate courses panel")
	public void enter_coursename_on_searchbox_and_validate_courses_panel() throws Exception {
		Searchoptions_page.enterTextOnSearchBox();
		Thread.sleep(3000);
		Searchoptions_page.clickOnSearchIconButton();
		Thread.sleep(3000);
		Validations.IsTrue(Common_methods.CurrentUrl(), Constants.coursespanelurl, "courses panel page is not displayed");
		Thread.sleep(3000);
		
	}

//	@Given("enter type of disease on topic filter and validate")
//	public void enter_type_of_disease_on_topic_filter_and_validate() throws Exception {
//		Searchoptions_page.enterTextOnTopicFilter();
//		Thread.sleep(3000);
//		Validations.IsDsiplayed(Searchoptions_page.textOnTopicFilter(), "Textbox of topic filter is not displayed");
//		Thread.sleep(3000);
//
//	}

//	@Given("select type of disease on search results and validate")
//	public void select_type_of_disease_on_search_results_and_validate() {
//		Common_methods.selectDropDown(Searchoptions_page.OnTopicFilter(),Constants.selectDisease);
//	}

	@Given("click on cross icon and verify the results")
	public void click_on_cross_icon_and_verify_the_results() throws Exception {
		Searchoptions_page.clickOnSearchResultCrossBtn();
		Thread.sleep(3000);
		
	}
	
	
	
	@Given("enter institute name in institution and validate")
	public void enter_institute_name_in_institution_and_validate() throws Exception {
		Searchoptions_page.enterInstitutionNameInTextBox();
		Thread.sleep(3000);
	}

	@Given("select institute name in institution and verify lectures")
	public void select_institute_name_in_institution_and_verify_lectures() {
	    
	}





}
