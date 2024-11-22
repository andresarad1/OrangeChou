package co.com.orange.tasks;

import co.com.orange.interations.Wait;
import co.com.orange.userinterfaces.ValidateHireUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.orange.userinterfaces.AplicationStagePage.*;
import static co.com.orange.userinterfaces.AplicationStagePage.BTN_SEARCH;
import static co.com.orange.userinterfaces.CreateCandidatePage.*;
import static co.com.orange.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AplicationStage implements Task {
    private String name,vacancy,manager;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_NEXT),
                Enter.theValue(NOTAS2).into(TXT_NOTES),
                Click.on(BTN_SAVE),
                Click.on(BTN_NEXT),
                Enter.theValue(TITLE_INTERVIEW).into(TXT_INTERVIEW),
                Enter.theValue("a").into(TXT_INTERVIEWER),
                Wait.theSeconds(2),
                Click.on(CLK_INTERVIEWER),
                Enter.theValue(DATE).into(SHD_DATE),
                Enter.theValue(TIME).into(SHD_TIME),
                Enter.theValue(NOTAS3).into(TXT_NOTES),
                Click.on(BTN_SAVE),
                Click.on(BTN_NEXT),
                Enter.theValue(NOTAS4).into(TXT_NOTES),
                Click.on(BTN_SAVE),
                Click.on(BTN_OFFERJOB),
                Enter.theValue(NOTAS5).into(TXT_NOTES),
                Click.on(BTN_SAVE),
                Click.on(BTN_NEXT),
                Enter.theValue(NOTAS6).into(TXT_NOTES),
                Click.on(BTN_SAVE),
                Wait.theSeconds(10)
        );

        manager= ValidateHireUI.getLblDataCandidate(3).resolveFor(actor).getText();
        name= ValidateHireUI.getLblDataCandidate(1).resolveFor(actor).getText();
        vacancy= ValidateHireUI.getLblDataCandidate(2).resolveFor(actor).getText();
        actor.remember("manager",manager);
        actor.remember("name",name);
        actor.remember("vacancy",vacancy);

        actor.attemptsTo(
                Click.on(BTN_RECRUITMENT),
                Wait.theSeconds(5),
                Click.on(DROPDOWN),
                Wait.theSeconds(5),
                Click.on(DROPDOWN_OPTION),
                Click.on(TXT_USER),
                Enter.theValue(FIRSTNAME).into(TXT_USER),
                Click.on(CLK_USER),
                Click.on(BTN_SEARCH),
                Wait.theSeconds(5)
        );
    }
    public static AplicationStage aplicationStage() {return instrumented(AplicationStage.class);}
}
