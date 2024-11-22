package co.com.orange.stepdefinitions;

import co.com.orange.question.ValidateHireQuestion;
import io.cucumber.java.en.*;
import co.com.orange.tasks.CreateCandidate;
import co.com.orange.tasks.AplicationStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateCandidateSteps {

    @When("Recruitment form opens and clicks add")
    public void recruitment_form_opens_and_clicks_add() {
    theActorInTheSpotlight().attemptsTo(CreateCandidate.createCandidate());
    }
    @When("The candidate form is filled out")
    public void the_candidate_form_is_filled_out() {
        theActorInTheSpotlight().attemptsTo(AplicationStage.aplicationStage());
    }
    @Then("It is validated that the candidate has been hired")
    public void It_is_validated_that_the_candidate_has_been_hired() {
        theActorInTheSpotlight().should(seeThat(ValidateHireQuestion.validateHireQuestion(), Matchers.is(true)));
    }
}
