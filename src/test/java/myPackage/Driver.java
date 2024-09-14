package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver extends Elements {
    public ChromeDriver driver;

    public ChromeDriver driver() {
        // opens chrome browser
        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        String os = System.getProperty("os.name");
        if (os.equals("Windows 10")) {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        }
        driver = new ChromeDriver();

        /*System.setProperty("webdriver.chrome.driver",".idea\\drivers\\chromedriver.exe");
        ChromeDriver browser = new ChromeDriver();
        return browser;*/


        return driver;
    }
}