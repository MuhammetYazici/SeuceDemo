package SAUCEDEMO;

import _01_SeleniumProject.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_05_Shopping extends Myfunc {



    @Test()
    public void US_5(){

        login();

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

        driver.quit();
    }
}
