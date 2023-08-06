package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class JsAlerts {
    ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void options(){
        options = new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }
    @Test(priority = 1)
     public void ClickJS1(){
      WebElement e= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
      e.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        System.out.println(result);

    }
@Test(priority = 2)
    public void ClickJS2(){
        WebElement element = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        element.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String response = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(response,"You clicked: Ok");
        System.out.println(response);
}
@Test
    public void ClickJS3(){

    WebElement element = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
    element.click();

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
    wait.until(ExpectedConditions.alertIsPresent());

    Alert alert = driver.switchTo().alert();
    alert.sendKeys("Viswa");
         alert.accept();

String response = driver.findElement(By.id("result")).getText();
    //Assert.assertEquals(response,"You clicked: Ok");
    System.out.println(response);
}

}



