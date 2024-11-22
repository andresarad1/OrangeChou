package co.com.orange.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.orange.userinterfaces.ValidateHireUI.getLblStatusCandidate;
import static co.com.orange.utils.Constants.*;

public class ValidateHireQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor Ruben) {
        return  getLblStatusCandidate(2).resolveFor(Ruben).getText().equals(Ruben.recall("vacancy").toString())&&
                getLblStatusCandidate(3).resolveFor(Ruben).getText().equals(Ruben.recall("name").toString())&&
                getLblStatusCandidate(4).resolveFor(Ruben).getText().equals(Ruben.recall("manager").toString())&&
                getLblStatusCandidate(6).resolveFor(Ruben).getText().equals(STATUS);
    }
    public static ValidateHireQuestion validateHireQuestion(){
        return new ValidateHireQuestion();
    }
}
