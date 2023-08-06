package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment01 {

    ChromeOptions options;
    WebDriver driver;

    @BeforeSuite
    public void SetOptions() {
        options = new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");
        driver.get("https://awesomeqa.com/practice.html");
    }

    @Test(priority = 1)
    public void FirstName() {
        WebElement Name = driver.findElement(By.name("firstname"));
        Name.sendKeys("Viswa");
    }

    @Test(priority = 2)
    public void LastName() {
        WebElement Name = driver.findElement(By.name("lastname"));
        Name.sendKeys("P");
    }

    @Test(priority = 3)
    public void Gender() {
        WebElement Name = driver.findElement(By.id("sex-0"));
        Name.click();
    }

    @Test(priority = 4)
    public void Experience() {
        WebElement e = driver.findElement(By.id("exp-3"));
        e.click();
    }

    @Test(priority = 5)
    public void Date() {
        WebElement DatePicker = driver.findElement(By.id("datepicker"));
        DatePicker.sendKeys("06-08-2023");
    }

    @Test(priority = 6)
    public void Profession() {
        WebElement Pro = driver.findElement(By.id("profession-0"));
        Pro.click();
    }

    @Test(priority = 7)
    public void AutomationTools() {
        WebElement Tools = driver.findElement(By.id("tool-2"));
        Tools.click();
    }

    @Test(priority = 8)
    public void Contents() {
        WebElement Tools = driver.findElement(By.id("continents"));
        Select select = new Select(Tools);
        select.selectByVisibleText("Asia");
        //  Tools.click();
    }

    @Test(priority = 9)
    public void Commands() {
        WebElement Command = driver.findElement(By.xpath("//option[normalize-space()='Wait Commands']"));
        Command.click();
    }

    @Test(priority = 10)
    public void Choosefile() throws InterruptedException {

        driver.findElement(By.cssSelector("#photo")).sendKeys("C:\\Users\\VISWA\\OneDrive\\Documents\\Resume.docx");

    }
        @Test(priority = 11)
        public void Download () {
            WebElement Downloadfile = driver.findElement(By.xpath("//a[normalize-space()='Click here to Download File']"));
            Downloadfile.click();
        }
@AfterSuite
    public  void quit(){
        driver.quit();
}

    }

