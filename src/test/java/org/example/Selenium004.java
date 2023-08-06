package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium004 {
    public static void main(String[] args) {

        //Difference between Quit and Close
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("--start--maximized");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swayam.linkintime.co.in/#");
        System.out.println(driver.getTitle());

        driver.close();
    }
}
