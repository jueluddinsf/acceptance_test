package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public ChromeDriver driver() {
        // opens chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver browser = new ChromeDriver();
        return browser;
    }

}
