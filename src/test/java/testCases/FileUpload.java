package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
    //file path=C:\Users\Sushil\Desktop\Interview Prep_Supriya\Q&A\Cucumber

    WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");
     driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement uploadSection=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("    //a[@href=\"/upload\"]")));
        uploadSection.click();

    WebElement uploadCTA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@  id=\"file-upload\"]")));
    uploadCTA.sendKeys("C:\\Users\\Sushil\\Desktop\\Interview Prep_Supriya\\Q&A\\Git.docx");
    driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
        WebElement FileUploadSucc=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Git.docx\"]")));
        String str=FileUploadSucc.getText();
        System.out.println(str);
    Assert.assertEquals(str,"Git.docx");
    System.out.println("test passed");

}}
