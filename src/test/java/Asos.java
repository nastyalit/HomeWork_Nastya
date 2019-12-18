import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Asos {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    public void AsosElementsTest()  {
        driver.get("https://www.asos.com/");
        driver.findElement(By.cssSelector(".src-GlobalBanner-Button-Button_button")).click();
        driver.findElement(By.xpath("//section[@id='globalBannerComponent']//a[2]")).click();
        driver.findElement(By.cssSelector("._24SZgSx._6DZZlcW")).click();
        driver.findElement(By.xpath("//a[@class='_24SZgSx _6DZZlcW']")).click();
        driver.findElement(By.cssSelector(".AckDUvD.-rhP1cz.gBrrjX4._2nHArcS")).click();
        driver.findElement(By.xpath("//a[@class='TO7hyVB _3B0kHbC _3AH1eDT'][contains(text(),'WOMEN')]")).click();
        driver.findElement(By.cssSelector(".kH5PAAC")).click();
        driver.findElement(By.xpath("//button[@class='kH5PAAC']")).click();
        driver.findElement(By.cssSelector("._26lJ0fq.-rhP1cz.gBrrjX4._2nHArcS")).click();
        driver.findElement(By.xpath("//span[@class='_26lJ0fq -rhP1cz gBrrjX4 _2nHArcS']")).click();


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000
        );
        driver.quit();
    }


}