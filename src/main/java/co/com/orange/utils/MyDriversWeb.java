package co.com.orange.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriversWeb {
    private static WebDriver driver;

    public static MyDriversWeb web (){
        System.setProperty("webchromedriver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return new MyDriversWeb();
    }

    public WebDriver inThePage(String url){
        driver.get(url);
        return driver;
    }


}
