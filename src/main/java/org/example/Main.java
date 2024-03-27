package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Main {
    public static void main(String[] args) {
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\inclusive011\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("inclusiv academy");
        search.sendKeys(Keys.RETURN);
        WebElement first = driver.findElement(By.xpath("//div[@id='search']//a"));
        first.click();
    }
}