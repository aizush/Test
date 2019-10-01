package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utils.Driver;


public class TitleVerify {


    @Given("User can see the page")
    public void user_can_see_the_page() {
        Driver.getDriver().get("http://apple.com");
    }

    @Then("The title is {string}")
    public void the_title_is(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }
}
