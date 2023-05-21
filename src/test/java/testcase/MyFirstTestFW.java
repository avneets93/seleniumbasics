package testcase;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyFirstTestFW extends BaseTest {

    @Test(dataProvider = "credentials")
    public static void LoginTest(String username, String pass){
        driver.findElement(By.linkText("Sign In")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name(locator.getProperty("sign_in_link"))).click();
        driver.findElement(By.name(locator.getProperty("user_name"))).sendKeys(username);
        driver.findElement(By.name(locator.getProperty("password"))).click();
        driver.findElement(By.name(locator.getProperty("password"))).sendKeys(pass);
        driver.findElement(By.id(locator.getProperty("login_button"))).click();

    }
    @DataProvider(name = "credentials")
    public Object[][] tData(){
        return new Object[][]{
                {"avneets93@gmail.com","Test@1234"},
                {"avneets93@gmail.com","Test@12345"}
        };
    }
}
