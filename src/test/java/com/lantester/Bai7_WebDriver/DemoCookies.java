package com.lantester.Bai7_WebDriver;

import com.lantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookies extends BaseTest {
      public static void main(String[] args) {
            creatBrowser();
            driver.get("https://crm.anhtester.com/admin/authentication");
            driver.findElement(By.id("email")).sendKeys("admin@example.com");
            driver.findElement(By.name("password")).sendKeys("123456");
            driver.findElement(By.tagName("button")).click();

            // Get all cookies
            Set<Cookie> cookies = driver.manage().getCookies();

            System.out.println(cookies.iterator().next().toString());

            closeBrowser();
      }
}
