package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("textarea[name='q']")));
        searchBox.sendKeys("Windows 11");
        searchBox.submit();
        wait.until(ExpectedConditions.titleContains("Windows 11"));
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Windows 11 - Google Search", "Titles do not match");
    }
}
