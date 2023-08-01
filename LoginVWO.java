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

public class LoginVWO {
        ChromeOptions options;
        WebDriver driver;
        @BeforeSuite
        public void setOptions(){
            options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        }
        @Test(priority = 1,groups = {"Negative TestCase,Sanity Test"})
        @Description("Verified that In-valid username and valid password ,Login successful")
        public void NegativeTest() throws InterruptedException {
            driver.get("https://app.vwo.com/#/login");
            driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.co");
            driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
            driver.findElement(By.id("js-login-btn")).click();
            Thread.sleep(2000);

            String errorString = driver.findElement(By.id("js-notification-box-msg")).getText();
            Assert.assertEquals(errorString,"Your email, password, IP address or location did not match");
            //System.out.println(driver.getTitle());
        }
        @Test(priority = 2,groups = {"positive Test case","Sanity Test"})
        @Description("Verified that valid username and valid password ,Login successful")
        public void PositiveTest() throws InterruptedException {
            driver.get("https://app.vwo.com/#/login");
            driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
            driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
            driver.findElement(By.id("js-login-btn")).click();
            Thread.sleep(2000);

            Assert.assertEquals(driver.getTitle(),"Dashboard");
            Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
        }
        @AfterSuite
        public void tearDown(){

            // driver.quit();

        }

    }


