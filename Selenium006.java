package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium006 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://swayam.linkintime.co.in/#");

       WebElement UserName = driver.findElement(By.id("txtUserName"));
       UserName.sendKeys("BEBPJ4022D");

        WebElement Password = driver.findElement(By.id("txtPassword"));
                Password.sendKeys("Qwerty@1234");

        WebElement SigninButton = driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div/div[2]/div[5]/div[2]/button"));
       SigninButton.click();
        driver.getTitle();
    }
}
