package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement button = driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]"));
        button.click();

        WebElement UserName = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        UserName.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement Button = driver.findElement(By.id("btn-login"));
        Button.click();
    }

    }


