package co.com.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CreateCandidatePage {

    public static final Target BTN_RECRUITMENT = Target.the("recruitment botton").located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));
    public static final Target BTN_ADD = Target.the("Add button ").located(By.xpath("//button[@type='button'][contains(.,'Add')]"));
    public static final Target TXT_FIRST_NAME = Target.the("First name").located(By.name("firstName"));
    public static final Target TXT_MIDDLE_NAME = Target.the("Middle name").located(By.name("middleName"));
    public static final Target TXT_LAST_NAME = Target.the("Last name").located(By.name("lastName"));
    public static final Target LST_VACANCY = Target.the("Vacancy type").located(By.xpath("//i[contains(@class, 'oxd-select-text--arrow')]"));
    public static final Target SLC_VACANCY = Target.the("Vacancy type").located(By.xpath("(//div[contains(.,'Payroll Administrator')])[14]"));
    public static final Target TXT_EMAIL = Target.the("Email").located(By.xpath("(//input[@placeholder='Type here'])[1]"));
    public static final Target TXT_NUMBER = Target.the("Contact Number").located(By.xpath("(//input[@placeholder='Type here'])[2]"));
    public static final Target TXT_KEYWORDS= Target.the("Keywords").located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
    public static final Target TXT_NOTES = Target.the("Notes").located(By.xpath("//textarea[@placeholder='Type here']"));
    public static final Target CHECKBOX = Target.the("Checkbox").located(By.xpath("//span[contains(@class, 'oxd-checkbox-input--active')]"));
    public static final Target BTN_SAVE = Target.the("Save").located(By.xpath("//button[text()=' Save ']"));
}
