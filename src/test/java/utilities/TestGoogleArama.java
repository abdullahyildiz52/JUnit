package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestGoogleArama {
    @org.junit.Test
    public void test01(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        WebElement aramaKutusuElementi= driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        aramaKutusuElementi.sendKeys("yandex");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

}
