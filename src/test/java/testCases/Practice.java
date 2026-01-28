package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.logging.Logger;

public class Practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // https://the-internet.herokuapp.com/
        driver.get("https://the-internet.herokuapp.com/");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        String expectedTitle="The Internet";
        WebElement abtesting=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='A/B Testing']")));
        abtesting.click();
        Assert.assertEquals(expectedTitle, driver.getTitle(),"title not matching");
        System.out.println("Test Executed");
        driver.close();
       // System.out.println(Assert.assertEquals(expectedTitle, driver.getTitle(),"title not matching"));
    }
}
