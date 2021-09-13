package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import salesforce.navigation.NavigateTo;
import salesforce.pages.ComponentReference;
import salesforce.pages.DeveloperGuide;
import salesforce.pages.LightningWebComponent;

public class UpdateUserDetails {

	@Steps
	NavigateTo navigateTo;

	@Steps
	DeveloperGuide developerGuide;

	@Steps
	ComponentReference componentReference;

	@Steps
	LightningWebComponent lightningWebComponent;

	@Given("^user is on salesforce developers portal$")
	public void user_is_on_salesforce_developers_portal() {
		navigateTo.goToSalesforceHomePage();
	}

	@When("^go to component reference page$")
	public void go_to_component_reference_page() {
		developerGuide.clickComponentReferenceTab();
	}

	@Then("^component reference page is loaded$")
	public void component_reference_page_is_loaded() {
		Assert.assertTrue("Component Reference content is not loaded", developerGuide.isComponentReferenceLoaded());
	}

	@When("^user enters datatable in Quick Find textbox$")
	public void user_enters_datatable_in_Quick_Find_textbox() {
		componentReference.enterTextInQuickFindTextbox("datatable");
	}

	@And("^selects datatable option under Lightning Web Components$")
	public void selects_datatable_option_under_Lightning_Web_Components() {
		componentReference.selectDatatableUnderLightningWebComponents();
	}

	@Then("^datatable is loaded$")
	public void datatable_is_loaded() {
		Assert.assertTrue("Lightning datatable content is not loaded", lightningWebComponent.isDatatableLoaded());
	}

	@When("^user selects data table with inline edit option under example$")
	public void user_selects_data_table_with_inline_edit_option_under_example() {
		lightningWebComponent.selectDataTableWithInlineEditUnderExample();
	}

	@And("^clicks run button$")
	public void clicks_run_button() {
		lightningWebComponent.clickRunButton();
	}

}
