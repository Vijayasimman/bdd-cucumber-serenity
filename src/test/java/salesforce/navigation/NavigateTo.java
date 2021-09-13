package salesforce.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {
	HomePage homePage;

	@Step("Open the Salesforce home page")
	public void goToSalesforceHomePage() {
		homePage.open();
	}
}