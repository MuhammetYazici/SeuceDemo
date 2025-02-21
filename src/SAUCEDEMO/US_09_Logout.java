package SAUCEDEMO;

import _01_SeleniumProject.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_09_Logout extends Myfunc {

    @Test
    public void logout(){

        login();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='react-burger-menu-btn']")));
        WebElement hamburgerMenu = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        hamburgerMenu.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='logout_sidebar_link']")));
        WebElement logout = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logout.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Swag Labs']")));
        WebElement swag = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        Assert.assertTrue("Çıkış yapılmasın",swag.isDisplayed());

        driver.quit();
    }


}
