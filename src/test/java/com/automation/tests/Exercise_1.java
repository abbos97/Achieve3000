package com.automation.tests;


import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import java.util.List;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercise_1 {

  private WebDriver driver;
  private Actions action;

        @BeforeMethod
    public void setup(){
        driver= DriverFactory.createDriver("chrome");

        driver.get("https://www.achieve3000.com");
        BrowserUtils.wait(4);

    }

    @Test
    public void clickHMenu1(){
            driver.findElement(By.xpath("//button[@class='navbar-toggler collapsed']")).click();
            BrowserUtils.wait(3);

           String expected="Who We Are";
           String actual=driver.findElement(By.xpath("//a[@href='/who-we-are/why-achieve3000/']")).
                   getText();
        BrowserUtils.wait(3);
           Assert.assertEquals(actual,expected);
           BrowserUtils.wait(3);

    }


@Test()
    public void openOurPartner2(){
    driver.findElement(By.xpath("//button[@class='navbar-toggler collapsed']")).click();
    BrowserUtils.wait(3);
            driver.findElement(By.xpath("//li[3]")).click();
        BrowserUtils.wait(3);
        String expected="Read the latest stories about how Achieve3000, " +
                "along with our partners, are helping to transform literacy worldwide.";
        String actual=driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(actual,expected);
        BrowserUtils.wait(3);
    }
@Test
public void listALlLogo(){
    driver.findElement(By.xpath("//button[@class='navbar-toggler collapsed']")).click();
    BrowserUtils.wait(3);
    driver.findElement(By.xpath("//li[3]")).click();
    BrowserUtils.wait(3);

            driver.findElement(By.tagName("h2")).click();
    BrowserUtils.wait(3);
    String expected="The Center for College & Career Readiness is a non-profit organization focused "+
            "leveraging leading research and proven best practices to improve instruction and skill development in all" +
            " grades, from preschool to higher education, and ensure all students graduate prepared to succeed in the " +
            "college or career of their choice. Faculty at the Center include Kevin E. Baird, Dr. Karin Hess, " +
            "Dr. Michael L. Kamil, Dr. Douglas Luffborough and Dr. Malbert Smith. Learn more at ";
    String actual=driver.findElement(By.cssSelector("/*[@id=\"fullpage\"]/div[2]/div[2]/div[1]/div[2]/div/p/text()")).getText();
    BrowserUtils.wait(3);
    Assert.assertEquals(actual,expected);

}

    @AfterMethod
    public void teardown(){
            driver.quit();
    }
}
