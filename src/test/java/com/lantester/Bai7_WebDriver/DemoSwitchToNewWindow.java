package com.lantester.Bai7_WebDriver;

import com.lantester.common.BaseTest;
import org.openqa.selenium.WindowType;

public class DemoSwitchToNewWindow extends BaseTest {
      public static void main(String[] args) {
            creatBrowser("Edge");

            driver.get("https://anhtester.com/");
            String mainWindow = driver.getWindowHandle();
            System.out.println(mainWindow);

            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://google.com/");
            System.out.println(driver.getWindowHandle());
            sleep(1);
//            driver.switchTo().defaultContent();

            driver.switchTo().window(mainWindow); // chuyển về cửa sổ mặc định ban đầu



            closeBrowser();
      }
}
