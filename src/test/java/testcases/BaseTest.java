package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        String browser = System.getProperty("browser");

        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);

        } else if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.get("https://www.google.com");
    }


    @AfterClass
    public void tearDown() {
        this.driver.close();
    }
}
