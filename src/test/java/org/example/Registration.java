package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    @Test


    public void RegistrationS(){

        System.setProperty("webdriver.chrome.driver", "E:\\udemy\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/magento-test/");

        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("firstname")).sendKeys("Andrei");
        driver.findElement(By.id("middlename")).sendKeys("D");
        driver.findElement(By.id("lastname")).sendKeys("Ioan");

        driver.findElement(By.name("email")).sendKeys("andrei2673@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("dimineata");
        driver.findElement(By.name("confirmation")).sendKeys("dimineata");
        driver.findElement(By.className("checkbox")).click();



    }


}
