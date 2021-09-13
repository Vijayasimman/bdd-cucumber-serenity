package salesforce.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ComponentReference extends UIInteractionSteps {

	static By QUICK_FIND_TXT_BOX = By.xpath("//input[@name='Quick Find']");
	static By LIGHTNING_WEB_COMPONENTS_DATATABLE_OPTION = By.xpath(
			"//*[text()='Lightning Web Components']/following::*[@class='slds-tree_container'][1]//*[text()='datatable']");
	static By LIGHTNING_DATATABLE_CONTENT = By.xpath("//*[@data-bundle-descriptor='lightning-datatable']");

	@Step("Enter text in Quick Find textbox")
	public void enterTextInQuickFindTextbox(String text) {
		$(QUICK_FIND_TXT_BOX).waitUntilClickable();
		$(QUICK_FIND_TXT_BOX).click();
		$(QUICK_FIND_TXT_BOX).sendKeys(text);
	}

	@Step("Select datatable under Lightning Web Components")
	public void selectDatatableUnderLightningWebComponents() {
		$(LIGHTNING_WEB_COMPONENTS_DATATABLE_OPTION).waitUntilClickable();
		$(LIGHTNING_WEB_COMPONENTS_DATATABLE_OPTION).click();
	}

}
