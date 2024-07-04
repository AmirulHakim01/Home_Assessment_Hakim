package com.Automated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmountUpdate {
	 public static void main(String[] args) {
	    	
	    	
	        WebDriver driver = new ChromeDriver();
	       
	        driver.get("https://www.xe.com/");

	        

	        driver.findElement(By.id("amount")).click();
	        driver.findElement(By.id("amount")).sendKeys("200");
	        driver.findElement(By.cssSelector("USD")).click();
	        driver.findElement(By.cssSelector("MYR")).click();
	        driver.findElement(By.id("Convert")).click();
	        driver.findElement(By.id("amount")).sendKeys("345");

	        driver.quit();
}
}
