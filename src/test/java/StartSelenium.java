import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    WebDriver webDriver;

    @BeforeMethod
    public void init(){
        webDriver = new ChromeDriver();
        // https://contacts-app.tobbymarshall815.vercel.app/
     // webDriver.get("https://contacts-app.tobbymarshall815.vercel.app");// without history


       webDriver.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); ///with history
//        webDriver.navigate().refresh();
//        webDriver.navigate().forward();
//        webDriver.navigate().back();



    }

   @Test
   public void firstTest(){
        //click login btn

       webDriver.findElement(By.tagName("div"));

       WebElement element = webDriver.findElement(By.tagName("a"));
       List<WebElement> list = webDriver.findElements(By.tagName("a"));

       webDriver.findElement(By.tagName("h1"));
       webDriver.findElement(By.tagName("input"));
       webDriver.findElement(By.tagName("button"));
       webDriver.findElement(By.cssSelector("table#customers  tr:last-child td:last-child"));
       // fill email
       //fill password
       // login btn

   }

    @AfterMethod
    public void tearDown(){
    //  webDriver.quit();
    //  webDriver.close();

    }

}
