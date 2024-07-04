package com.Automated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidInput {
	 public static void main(String[] args) {
	
	
    WebDriver driver = new ChromeDriver();
   
    driver.get("https://www.xe.com/");

    

    driver.findElement(By.id("amount")).click();
    driver.findElement(By.id("amount")).sendKeys("-5");
    driver.findElement(By.cssSelector("USD")).click();
    driver.findElement(By.cssSelector("MYR")).click();
    driver.findElement(By.id("Convert")).click();
   

    driver.quit();
}

}
