package co.com.choucair.certication.airbnb.stepdefinitions;

import co.com.choucair.certificacion.airbnb.model.InitializeObjects;
import co.com.choucair.certificacion.airbnb.tasks.ComeIn;
import co.com.choucair.certificacion.airbnb.tasks.Star;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChallengeAirbnbSD
{
    @Before
    public void initial_setup()
    {
        setTheStage(new OnlineCast());
    }

    @Given("^I have visited Airbnb on te web$")
    public void iHaveVisitedAirbnbOnTeWeb()
    {
        theActorCalled("Alvaro").wasAbleTo(Star.webSite());
    }

    @When("^I search for Airnbn$")
    public void iSearchForAirnbn(List<InitializeObjects> data)
    {
        theActorInTheSpotlight().attemptsTo(ComeIn.WebSiite(data));
    }

    @Then("^I verify that I found my accommodation$")
    public void iVerifyThatIFoundMyAccommodation()
    {

    }
}
