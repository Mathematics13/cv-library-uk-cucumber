package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle)
    {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance ) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search Options link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on {string} button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();                                          //Problem with this
    }

    @Then("I should see the result {string}")
    public void iShouldSeeTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(result) ,result );
    }
}
