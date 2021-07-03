package com.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

    @Test
    public void test_url(){

        System.out.println("amazon url");

        System.setProperty("webdriver.chrome.driver","resource//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com/");

        driver.close();
    }
}
