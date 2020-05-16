package myPackage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs extends Driver {
    Driver d = new Driver();
    ChromeDriver browser = d.driver();

    @Given("^I am on google search page$")
    public void i_am_on_google_search_page() throws Exception {
        // opens chrome browser
        // go to a url
        String url = "https://www.google.com/";
        browser.get(url);
    }

    @When("^I enter \"([^\"]*)\" into the search box$")
    public void i_enter_into_the_search_box(String address) throws Exception {
        d.googleSearchField(browser).sendKeys(address);
        d.googleSearchField(browser).sendKeys(Keys.RETURN);
    }

    @Then("^I should see search result showing the same search \"([^\"]*)\" item$")
    public void i_should_see_search_result_showing_the_same_search_item(String expectedResult) throws Exception {
        boolean actual_result = browser.getPageSource().contains(expectedResult);
        Assert.assertTrue(actual_result);
    }


    @Given("^I am on the home page of mercury tours$")
    public void iAmOnTheHomePageOfMercuryTours() {
        // opens chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        browser = new ChromeDriver();
        // go to a url
        String url = "http://newtours.demoaut.com/";
        browser.get(url);
    }

    @When("^I click on the register link$")
    public void iClickOnTheRegisterLink() {
        browser.findElement(By.linkText("REGISTER")).click();
    }

    @And("^I should see register page$")
    public void iShouldSeeRegisterPage() {
        String expect_page_title = "Register: Mercury Tours";
        String actual_title = browser.getTitle();
        Assert.assertEquals(actual_title, expect_page_title);
    }

    @And("^I enter all required information$")
    public void iEnterAllRequiredInformation() {
        browser.findElement(By.id("email")).sendKeys("autotester@gmail.com");
        browser.findElement(By.name("password")).sendKeys("myPassword");
        browser.findElement(By.name("confirmPassword")).sendKeys("myPassword");
        // click enter after that
        browser.findElement(By.name("register")).click();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expected_test) throws Throwable {
        Assert.assertTrue(browser.getPageSource().contains(expected_test));
    }

    @Then("^I close the browser$")
    public void iCloseTheBrowser() {
        browser.close();
        browser.quit();
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        browser = new ChromeDriver();
        String test_url = "http://newtours.demoaut.com/";
        browser.get(test_url);
    }

    @When("^I click link \"([^\"]*)\"$")
    public void iClickLink(String text) throws Throwable {
        browser.findElement(By.linkText(text)).click();
    }

    @And("^I fillout all information in register page$")
    public void iFilloutAllInformationInRegisterPage() {
        browser.findElement(By.id("email")).sendKeys("testUser@gmail.com");
        browser.findElement(By.cssSelector("[name=password]")).sendKeys("myPassword");
        browser.findElement(By.name("confirmPassword")).sendKeys("myPassword");
        browser.findElement(By.xpath("//input[@name='register']")).click();
    }

    @Then("^I should have an account created$")
    public void iShouldHaveAnAccountCreated() {
        boolean textExists = browser.getPageSource().contains("Thank you for registering.");
        if (textExists) {
            System.out.println("Passed: User was able to register for new account");
        } else {
            System.out.println("Failed: User was not able to register for new account");
        }

    }

    @Given("^user clicks on flight$")
    public void userClicksOnFlight() {
        browser.findElement(By.linkText("Flights")).click();
    }

    @When("^user clicks continue from flight page$")
    public void userClicksContinueFromFlightPage() {
        browser.findElement(By.cssSelector("[name= findFlights]")).click();
    }

    @Then("^user should see \"([^\"]*)\"$")
    public void userShouldSee(String expected_text) throws Throwable {
        boolean textFoundInPage = browser.getPageSource().contains(expected_text);
        Assert.assertTrue(textFoundInPage);
    }
}
