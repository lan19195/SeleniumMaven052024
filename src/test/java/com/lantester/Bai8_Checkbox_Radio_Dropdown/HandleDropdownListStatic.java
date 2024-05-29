package com.lantester.Bai8_Checkbox_Radio_Dropdown;

import com.lantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownListStatic extends BaseTest {
      public static void main(String[] args) {
            creatBrowser();
            driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

            //Handle dropdown List tĩnh

            Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
            System.out.println(select.getFirstSelectedOption().getText());

            select.selectByVisibleText("Tuesday");

            //Kiểm tra đã chọn đúng hay chưa
            System.out.println(select.getFirstSelectedOption().getText());
            //Assert.assertEquals("Tuesday", select.getFirstSelectedOption().getText()); So sánh 2 giá trị có bằng nhau hay không

            select.selectByIndex(4);
            System.out.println(select.getFirstSelectedOption().getText());
            sleep(1);

            select.selectByValue("Saturday");
            System.out.println(select.getFirstSelectedOption().getText());

            //hàm getAll chỉ dùng cho t/h multi select
            Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
            selectMultiple.selectByIndex(1);
            selectMultiple.selectByIndex(2);
            selectMultiple.selectByIndex(3);

            List<WebElement> listOptions = selectMultiple.getAllSelectedOptions();
            for (WebElement option : listOptions){ // đây là vòng for cải tiến - for each, ko phải for thuần túy
                  System.out.println(option.getText());
            }



            closeBrowser();
      }
}
