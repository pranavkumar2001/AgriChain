package org.argichain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.argichain.driverFactory.webDriverManager;
import org.argichain.pageComponent.SubstringTestComponent;
import org.junit.Assert;

public class SubstringTest {
    SubstringTestComponent substring = new SubstringTestComponent(webDriverManager.getDriver());

    @Given("User navigates to the url {string}")
    public void userNavigatesToTheUrl(String url) {
       substring.userNavigatetoUrl(url);
    }

    @When("User enter the string {string} in the textbox")
    public void userEnterTheStringInTheTextbox(String string) {
        substring.userEnterString(string);
    }

    @And("User clicks the submit button")
    public void userClicksTheSubmitButton() {
        substring.userClicksSubmitButton();
    }

    @Then("User validates the output {string}")
    public void userValidatesTheOutput(String output) {
        Assert.assertTrue(substring.validateOutput(output));
    }
}
