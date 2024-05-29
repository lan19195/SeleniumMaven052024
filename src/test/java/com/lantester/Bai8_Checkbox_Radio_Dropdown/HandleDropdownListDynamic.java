package com.lantester.Bai8_Checkbox_Radio_Dropdown;

import com.lantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HandleDropdownListDynamic extends BaseTest {
      public static void main(String[] args) {
            creatBrowser();
            driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
            sleep(3);
            driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/parent::div")).click();
            sleep(2);
            driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("Ho");
            sleep(2);
            driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys(Keys.ENTER);


            //trường hợp search ra 2 kết quả thì ko dùng enter mà dùng click
            sleep(3);
            driver.findElement(By.xpath("(//span[normalize-space()='Hotels']/parent::a)/parent::div")).click();
            sleep(2);
            driver.findElement(By.xpath("(//span[normalize-space()='Hotels']/parent::a)/following-sibling::div//input")).sendKeys("F");
            sleep(2);
            driver.findElement(By.xpath("//li[normalize-space()='Fitness']")).click();
            sleep(2);


            closeBrowser();
      }
}
