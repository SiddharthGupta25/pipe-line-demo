package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch(){
        WebElement searchBox = this.driver.findElement(By.cssSelector("textarea[name='q']"));
        searchBox.sendKeys("Windows 11");
        searchBox.submit();
        String actualTitle = this.driver.getTitle();
        Assert.assertEquals(actualTitle, "Windows 11 - Google Search", "Titles do not match");
    }
}
