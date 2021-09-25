package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
        WebDriver w=new ChromeDriver();
        w.get("http://google.com");
        Thread.sleep(2000);
        WebElement s = w.findElement(By.name("q"));
        s.sendKeys("Sony Walkman");
        s.submit();
        Thread.sleep(2000);
        w.quit();
        
        
    }
}
