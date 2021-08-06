package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.TestSandbox;

public class TestSandboxSteps {
    TestSandbox sandboxPage = new TestSandbox();
    
    @Given ("^I navigate to the sandbox page$")
    public void navigateToTheSandboxSite(){
        sandboxPage.navigateToSandbox();
    }

    @And("^select a value from the dropdown$")
    public void selectState(){
        sandboxPage.selectCategory("Manual");
    }
}
