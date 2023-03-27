package test.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import test.CommonMethods.GenericMethods;

import javax.xml.xpath.XPath;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class ExitoMethods {

   // GenericMethods genericMethods = new GenericMethods();
    WebDriver driver;
    //statusFailed = false
    public void SeleccionarCategoria(WebDriver driver) throws InterruptedException{
        Thread.sleep(4000);
        /*genericMethods.clickSelenium(driver, XPath);
        genericMethods.clickSelenium(driver,Xpath subcategoria);
        genericMethods.clickSelenium(driver, seleccionar producto);
        genericMethods.clickSelenium(driver,seleccionar cantidad):
        genericMethods.clickSelenium(driver, seleccionar agregar);*/
        Thread.sleep(50);
       /* try {
             //wait;
            /*if(wait.until(ExpectedConditions.visibilityOfElementLocated(By locator)).isDisplayed){
                genericMethods.takeScreeShot(driver);
                System.out.println("eL USUARIO SELECCIONO EL PRODUCTO");
                //statusFailed=true;
            }*/


       /* }catch (Exception ignored){
            System.out.println("El no usuario selecciono los productos correctamente");
        }catch (Exception exception){
            exception.printStackTrace();
        }*/
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        Thread.sleep(2000);
    }

}
