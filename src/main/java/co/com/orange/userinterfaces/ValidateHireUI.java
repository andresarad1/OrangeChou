package co.com.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateHireUI {

    public static Target getLblDataCandidate (int index) {
        return Target.the("text ").located(By.xpath("(//p[@class='oxd-text oxd-text--p'])["+index+"]"));
    }

    public static  Target getLblStatusCandidate (int index) {
        return Target.the("Vacancy text ").located(By.xpath("//div[@class='oxd-table-body']/*[last()]//div//div[@role='cell']["+index+"]"));
    }
}
