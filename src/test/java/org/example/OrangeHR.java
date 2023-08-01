package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHR {
    ChromeOptions Options;
    WebDriver driver;

    @BeforeSuite
    public void setup() {
        Options = new ChromeOptions();
        driver = new ChromeDriver();
    }

    @Test
    @Description("Verify the functionality of Valid User Login")
    public void validlogin() throws InterruptedException {
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(2000);
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

        String errorString = driver.findElement(By.className("oxd-text oxd-text--p oxd-alert-content-text")).getText();
        Assert.assertEquals(errorString, "Invalid credentials");
        System.out.println(driver.getTitle());


    }
}
