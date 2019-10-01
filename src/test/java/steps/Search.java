package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

public class Search {

    @Given("User on home page of apple.com")
    public void user_on_home_page_of_apple_com() {
        Driver.getDriver().get("http://apple.com");
    }

    @Given("User searches for Iphone")
    public void user_searches_for_Iphone() {
       Driver.getDriver().findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();

    }

    @Then("User should be able to choose")
    public void user_should_be_able_to_choose() {
        Driver.getDriver().findElement(By.xpath("(//figure[@class='chapternav-icon'])[4]")).click();
    }

    @Then("User should see the product")
    public void user_should_see_the_product()  {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='fwl']")));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h1[@class='fwl']")).isDisplayed());
    }

}
