package co.com.orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.orange.userinterfaces.CreateCandidatePage.*;
import static co.com.orange.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCandidate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RECRUITMENT),
                Click.on(BTN_ADD),
                Enter.theValue(FIRSTNAME).into(TXT_FIRST_NAME),
                Enter.theValue(MIDDLENAME).into(TXT_MIDDLE_NAME),
                Enter.theValue(LASTNAME).into(TXT_LAST_NAME),
                Click.on(LST_VACANCY),
                Click.on(SLC_VACANCY),
                Enter.theValue(EMAIL).into(TXT_EMAIL),
                Enter.theValue(NUMBER).into(TXT_NUMBER),
                Enter.theValue(KEYWORDS).into(TXT_KEYWORDS),
                Enter.theValue(NOTAS).into(TXT_NOTES),
                Click.on(CHECKBOX),
                Click.on(BTN_SAVE)
        );
    }
    public static CreateCandidate createCandidate(){
        return instrumented(CreateCandidate.class);
    }
}
