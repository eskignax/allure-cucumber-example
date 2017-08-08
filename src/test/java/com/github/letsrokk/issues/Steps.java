package com.github.letsrokk.issues;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;

/**
 * Created by majer-dy on 08/08/2017.
 */
public class Steps {

    @Then("^report\\.json is not saved$")
    public void reportJsonIsNotSaved() throws Throwable {
        // no action needed
    }

    @Given("^feature or scenario has / in description$")
    public void featureHasInDescription() throws Throwable {
        // no action needed
    }

    @When("^running tests$")
    public void runningTests() throws Throwable {
        // no action needed
    }

    @Given("^feature and scenario do not have / in description$")
    public void featureDoesNotHaveInDescription() throws Throwable {
        // no action needed
    }

    @Then("^report\\.json is saved$")
    public void reportJsonIsSaved() throws Throwable {
        // no action needed
    }

    @Given("^step with @Step$")
    public void stepWithStep() throws Throwable {
        methodWithStep();
    }

    @Step("Call method with Step annotation")
    private void methodWithStep(){
        //no action needed
    }

    @Then("^exception thrown$")
    public void exceptionThrown() throws Throwable {
        // no action needed
    }
}
