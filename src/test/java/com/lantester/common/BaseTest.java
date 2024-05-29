package com.lantester.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

      public static WebDriver driver;

      public static void creatBrowser() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

      }

      // nếu muốn viết multi browser thì viết hàm if-else như sau:
      public static void creatBrowser(String browserName) {
            if (browserName.equals("Chrome")) {
                  driver = new ChromeDriver();
            }
            if (browserName.equals("Edge")) {
                  driver = new EdgeDriver();
            }
            if (browserName.equals("Firefox")) {
                  driver = new FirefoxDriver();
            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

      }

      public static void closeBrowser() {
            try {
                  Thread.sleep(2000);
            } catch (InterruptedException e) {
                  throw new RuntimeException(e);
            }
            driver.quit();
      }
      public static void sleep(double second){
            try {
                  Thread.sleep((long) (1000 * second));
            } catch (InterruptedException e) {
                  throw new RuntimeException(e);
            }
      }
}
