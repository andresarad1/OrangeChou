package co.com.orange.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class LoginUserPage {

    public static final Target TXT_USER=Target.the("user").located(By.name("username"));

    public static final Target TXT_PASSWORD =Target.the("password").located(By.name("password"));

    public static final Target BTN_CONTINUE =Target.the("login continue").located(By.xpath("//button[@type='submit']"));

}
