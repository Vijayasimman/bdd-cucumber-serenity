package salesforce.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class DeveloperGuide extends UIInteractionSteps {

	static By COMPONENT_REFERENCE_TAB = By.xpath("//div[@class='slds-grid']//span[@title='Component Reference']");
	static By COMPONENT_REFERENCE_CONTENT = By.cssSelector("div[class='main show-sidebar']");
	static By SORRY_TO_INTERRUPT_ERROR_MSG = By.cssSelector("#auraErrorMessage");

	@Step("Click Component Reference tab")
	public void clickComponentReferenceTab() {
		if ($(SORRY_TO_INTERRUPT_ERROR_MSG).isDisplayed()) {
			getDriver().navigate().refresh();
		}
		$(COMPONENT_REFERENCE_TAB).waitUntilClickable();
		$(COMPONENT_REFERENCE_TAB).click();
	}

	@Step("Component Reference is loaded")
	public boolean isComponentReferenceLoaded() {
		$(COMPONENT_REFERENCE_CONTENT).waitUntilVisible();
		return $(COMPONENT_REFERENCE_CONTENT).isDisplayed();
	}

}
