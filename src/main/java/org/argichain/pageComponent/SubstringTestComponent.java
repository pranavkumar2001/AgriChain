package org.argichain.pageComponent;

import org.argichain.BaseClass.BasePage;
import org.argichain.locatorInterface.SubstringTestInterface;
import org.openqa.selenium.WebDriver;

public class SubstringTestComponent extends BasePage implements SubstringTestInterface {
    // Constructor to initialize the component with WebDriver
    public SubstringTestComponent(WebDriver driver){
        super(driver);
    }

    // Method to navigate to the specified URL using WebDriver
    public void userNavigatetoUrl(String url) {
        navigateToUrl(url);
    }

    // Method to wait for the input textbox and enter the provided string
    public void userEnterString(String string) {
        waitForvisibilityOfElement(inputTextBox);
        sendvalueToTextbox(inputTextBox, string);
    }

    // Method to wait for the submit button and perform a click action
    public void userClicksSubmitButton() {
        waitForvisibilityOfElement(submitButton);
        clickOnButton(submitButton);
    }

    // Method to validate the output text by comparing expected and actual values
    public boolean validateOutput(String expectedOutput) {
        waitForvisibilityOfElement(outputTextBox);
        String actualOutput = getAttributeValue(outputTextBox, "value");
        return expectedOutput.equals(actualOutput);
    }
}
