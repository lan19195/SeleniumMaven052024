package com.lantester.Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
      public static void main(String[] args) throws InterruptedException {
            //khởi tạo Browser
            //ChromeDriver,EdgeDriver...
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //Open website
            driver.get("https://cms.anhtester.com/login");

            //Định vị các element trên trang login CMS
            //1.Định vị ô email
            driver.findElement(By.id("email")).sendKeys("admin@example.com");
            driver.findElement(By.name("password")).sendKeys("123456");
            driver.findElement(By.tagName("button")).click();

            Thread.sleep(1000);

            //tắt Browser
            driver.quit();

      }
}
