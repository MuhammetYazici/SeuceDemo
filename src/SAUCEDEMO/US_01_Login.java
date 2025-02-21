package SAUCEDEMO;

import _01_SeleniumProject.Myfunc;
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

public class US_01_Login extends Myfunc {
    WebDriver driver =new ChromeDriver();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor)driver;

    @Test
    public void login(){
        driver.get("https://www.saucedemo.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("standard_user");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='login-button']")));

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();

        driver.quit();
    }



}
