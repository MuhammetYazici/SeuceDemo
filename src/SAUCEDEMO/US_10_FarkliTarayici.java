package SAUCEDEMO;

import _01_SeleniumProject.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_10_FarkliTarayici extends Myfunc {

    @Test
    public void test(){

        EdgeDriver driver = new EdgeDriver();

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
