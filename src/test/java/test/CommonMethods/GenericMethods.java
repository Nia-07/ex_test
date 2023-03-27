/*package test.CommonMethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericMethods {


    int time = 10;

    public static void clickSelenium(By locator){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(locator).click());
    }

    public static void sendTextSelenium(By locator, String sendText){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator).sendKeys(sendText));
    }


    public void takeScreeShot(WebDriver driver){
        File screenshotLoginUser = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File directory = new File ("C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\screenshotLoginUser\\Login_Sefi_1");
        try {
            Date fecha = new Date();
            DateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd HH.mm.ss");
            FileUtils.copyFile(screenshotLoginUser, new File(directory +   formatDate.format(fecha) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}*/
