package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium005 {
    public static void main(String[] args) throws MalformedURLException {

        //Difference between Quit and Close
ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
//Difference between Get() and Navigate

        driver.navigate().to("https://swayam.linkintime.co.in/#");
        driver.navigate().to(new URL("https://www.google.com/"));

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

    }
}
