package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;


public class OrangeHRM {
    ChromeOptions Options;
    WebDriver driver;

    @BeforeSuite
    public void setup() {
        Options = new ChromeOptions();
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    @Description("Verify the functionality of Valid User Login")
    public void validlogin() throws InterruptedException {
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

       // Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test
    @Description("Verify the functionality of In-Valid User Login")
    public void invalidLogin() throws InterruptedException {
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("admin12");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement Errormessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
       new WebDriverWait(driver , Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Errormessage));




    }
}
