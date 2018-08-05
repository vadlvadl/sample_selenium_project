package com.lizogub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        // Path to ChromeDriver
        System.setProperty("webdriver.chrome.driver","chromedriver_win_x86_2.41.exe");

        // Path to GeckoDriver
        System.setProperty("webdriver.gecko.driver","geckodriver_win_x64_0.21.0.exe");


        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("IT Hillel");
        searchBox.submit();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}
