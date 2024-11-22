package co.com.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AplicationStagePage {
    public static final Target BTN_NEXT = Target.the("next").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target TXT_INTERVIEW = Target.the("Interview Title").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[6]"));
    public static final Target TXT_INTERVIEWER = Target.the("Interviewer").located(By.cssSelector("div.oxd-autocomplete-text-input--active input[placeholder='Type for hints...']"));
    public static final Target CLK_INTERVIEWER = Target.the("Click interview").located(By.xpath("//div[@role='listbox']//*[1]"));
    public static final Target SHD_DATE = Target.the("Schedule Date").located(By.cssSelector("input[placeholder='yyyy-dd-mm']"));
    public static final Target SHD_TIME = Target.the("Schedule Time").located(By.cssSelector("input[placeholder='hh:mm']"));
    public static final Target BTN_OFFERJOB = Target.the("Offer JOb").located(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--success'])[2]"));
    public static final Target DROPDOWN = Target.the("dropdown").located(By.xpath("(//div[contains(@class, 'oxd-select-text') and contains(@class, 'oxd-select-text--active')])[4]"));
    public static final Target DROPDOWN_OPTION = Target.the("Opción dropdown").located(By.xpath("//div[@role='listbox']//*[contains(text(),'Hired')]"));
    public static final Target BTN_SEARCH = Target.the("Botón de búsqueda").located(By.cssSelector("button[type='submit']"));
    public static final Target TXT_USER= Target.the("user").located(By.xpath("//input[@placeholder='Type for hints...']"));
    public static final Target CLK_USER= Target.the("user").located(By.xpath("//div[@class='oxd-autocomplete-dropdown --positon-bottom']//*[contains(text(),'Andres')]"));

}
