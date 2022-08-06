package co.com.choucair.certification.pruebautest.stepdefinitions;

import co.com.choucair.certification.pruebautest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaUtestStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan");
    }
    @Given("^than Juan wants to enter the Utest website$")
    public void thanJuanWantsToEnterTheUtestWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }


    @When("^fill in the fields to register$")
    public void fillInTheFieldsToRegister() {
        theActorInTheSpotlight().attemptsTo(Home.thePage(), Personal.the(), Address.the(),
                Devices.the(), Complete.the());
    }

    @Then("^registration is successful$")
    public void registrationIsSuccessful() {

    }
}
