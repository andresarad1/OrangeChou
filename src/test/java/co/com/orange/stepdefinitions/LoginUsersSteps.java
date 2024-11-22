package co.com.orange.stepdefinitions;

import co.com.orange.tasks.LoginUser;
import co.com.orange.utils.MyDriversWeb;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.orange.utils.Constants.*;
import static co.com.orange.utils.Constants.URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUsersSteps {


    @Given("client navigates to website")
    public void client_navigates_to_website() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
    }
   @When("Enter valid credentials")
    public void enter_valid_credentials() {
       theActorInTheSpotlight().attemptsTo(LoginUser.loginUser());
    }

}
