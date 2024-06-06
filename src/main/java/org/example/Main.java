package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        HaltOrWait.Halt();
        List<WebElement> Men = driver.findElements(By.xpath("//span[normalize-space()='Men']"));
        System.out.println("size is " + Men.size());
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(Men.getFirst()).build().perform();

        //WebElement ele = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[3]/ul"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(ele).build().perform();


        List<WebElement> Top = driver.findElements(By.cssSelector("a[id='ui-id-17'] span:nth-child(2)"));
        System.out.println("size is " + Top.size());

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(Top.getFirst()).build().perform();



        driver.findElement(By.xpath("//a[@id='ui-id-19']")).click();

       // WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]/span"));
        //Actions actions2 = new Actions(driver);
       // actions2.moveToElement(ele2).build().perform();



    }
}