package org.example;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium003 {
    public static void main(String[] args) {
        //Page load Strategy
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
    }
}
