package salesforce.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LightningWebComponent extends UIInteractionSteps {

	static By LIGHTNING_DATATABLE_CONTENT = By.xpath("//*[@data-bundle-descriptor='lightning-datatable']");
	static final By EXAMPLE_COMBOBOX = By.xpath("//input[@role='combobox']");
	static final By DATA_TABLE_WITH_INLINE_EDIT_OPTION = By.xpath("//span[@title='Data Table with Inline Edit']");
	static final By RUN_BTN = By.xpath("//*[contains(@class,'slds-button') and text()='Run']");

	@Step("Datatable is loaded")
	public boolean isDatatableLoaded() {
		$(LIGHTNING_DATATABLE_CONTENT).waitUntilVisible();
		return $(LIGHTNING_DATATABLE_CONTENT).isDisplayed();
	}

	@Step("Select Data Table with Inline Edit under Example")
	public void selectDataTableWithInlineEditUnderExample() {
		getDriver().navigate().refresh();
		$(EXAMPLE_COMBOBOX).waitUntilClickable();
		$(EXAMPLE_COMBOBOX).click();
		$(DATA_TABLE_WITH_INLINE_EDIT_OPTION).waitUntilVisible();
		$(DATA_TABLE_WITH_INLINE_EDIT_OPTION).waitUntilClickable();
		$(DATA_TABLE_WITH_INLINE_EDIT_OPTION).click();
	}

	@Step("Click Run button")
	public void clickRunButton() {
		$(RUN_BTN).waitUntilClickable();
		$(RUN_BTN).click();
	}
}
