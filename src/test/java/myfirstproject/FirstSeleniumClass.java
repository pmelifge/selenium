package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //SET UP DRIVER
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //CREATE CHROMEDRIVER
        WebDriver driver = new ChromeDriver();
         // now that we can use that driver for automation of the test cases
        driver.get("https://www.amazon.com");
    }
}
