package com.lantester.Bai8_Checkbox_Radio_Dropdown;

import com.lantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
      public static void main(String[] args) {
            creatBrowser();
            driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

            //handel radio
            boolean checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//input[@value='Male']")).isSelected();
            System.out.println("Male :" + checkRadioMale);
            boolean checkRadioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//input[@value='Female']")).isSelected();
            System.out.println("Female :" + checkRadioFemale);

            driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//input[@value='Male']")).click();
            driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//input[@value='Female']")).click();

            boolean checkRadioMaleSelected = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//input[@value='Male']")).isSelected();
            System.out.println("Male Selected:" + checkRadioMaleSelected);
            boolean checkRadioFemaleSelected = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//input[@value='Female']")).isSelected();
            System.out.println("Female Selected:" + checkRadioFemaleSelected);


            // Handel Multi radio button
            List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']//following-sibling::label//input"));
            System.out.println("Radio total: " + listRadio.size());

            for(int i = 0; i < listRadio.size(); i++){
                  System.out.println("Radio thứ " + (i+1) + ":" + listRadio.get(i).isSelected());
            }

            //click chọn radio thứ 2 - tương ứng index 1 trong list
            listRadio.get(1).click();
            for(int i = 0; i < listRadio.size(); i++){
                  System.out.println("Radio thứ " + (i+1) + ":" + listRadio.get(i).isSelected());
            }

            closeBrowser();
      }
}
