package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WishListTest {

    @Test

    public void addToWishlist() {
        System.setProperty("webdriver.chrome.driver", "E:\\udemy\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/magento-test/");

        driver.findElement(By.linkText("SALE")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.linkText("Add to Wishlist")).click();



    }


}
