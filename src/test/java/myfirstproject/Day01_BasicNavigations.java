package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();
        //driver.close();
        driver.quit();
    }
}
