package _01_SeleniumProject;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_OpeningWebsite extends Myfunc {


    @Test
    public void test1(){

        WebDriver driver =new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='shopping_cart_link']")));
        WebElement shoppingCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shoppingCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout']")));
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='first-name']")));
        WebElement firstName = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstName.sendKeys("mehmet");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='last-name']")));
        WebElement lastName= driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.sendKeys("yıldız");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='postal-code']")));
        WebElement postCode = driver.findElement(By.xpath("//*[@id='postal-code']"));
        postCode.sendKeys("61300");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continue']")));
        WebElement continueq = driver.findElement(By.xpath("//*[@id='continue']"));
        continueq.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='finish']")));
        WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
        js.executeScript("arguments[0].scrollIntoView(false);",finish);
        finish.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Thank you for your order!']")));
        WebElement message = driver.findElement(By.xpath("//*[text()='Thank you for your order!']"));

        Assert.assertTrue("Mesaj Bulunamadı", message.isDisplayed());

        driver.quit();

    }
}
