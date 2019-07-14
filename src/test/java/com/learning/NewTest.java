package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
    private WebDriver driver;
    @Test
    public void testEasy() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--window-size=1920,1200","--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        // Thread.sleep(5000L);  // Let the user actually see something!
        driver.get("http://www.google.com/xhtml");

        // Thread.sleep(5000L);  // Let the user actually see something!
        //driver.quit();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
