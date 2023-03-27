package test.Steps;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static test.Steps.ExitoTestTest.seleniumClick;

public class Exito {
    //UserLoginMethods userLoginMethods = new UserLoginMethods();

    @BeforeClass
    public void setUp() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        // WebDriver driver = new ChromeDriver();
        driver.get("https://www.exito.com/");
        By electronicos = By.xpath("//img[@alt=\"Electrodomésticos\"]");
        seleniumClick(driver, electronicos);
        driver.switchTo().parentFrame();
        Thread.sleep(10000);
        driver.close();
        driver.quit();

    }

    @Test

    public void loginAutofinance() throws InterruptedException {
        //userLoginMethods.Login(driver);

    }

    @AfterClass
    public void shutUp(){

    }



}
