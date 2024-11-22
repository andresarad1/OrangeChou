package co.com.orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.orange.userinterfaces.LoginUserPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.orange.utils.Constants.*;

public class LoginUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(TXT_USER),
                Enter.theValue(PASSWORD).into(TXT_PASSWORD),
                Click.on(BTN_CONTINUE)
        );
    }

    public static LoginUser loginUser(){
        return instrumented(LoginUser.class);
    }

}
