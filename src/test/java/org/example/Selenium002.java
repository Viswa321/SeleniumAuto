package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium002 {
    public static void main(String[] args) {

        ChromeOptions options  = new ChromeOptions();
        //options.setPageLoadStrategy() // To load page is HIGH , LOW , MEDIUM



       // options.getBrowserVersion();
       // options.addArguments("--headless==new");
      //  options.addExtensions(new File("\"E:\\Add Blocker.crx\""));

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        options.addArguments("--headless");
        System.out.println(driver.getTitle());
        //options.h
    }
}

