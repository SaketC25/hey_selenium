package selenium_study;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browswer {
;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(2000);
        
        String MainId= driver.getWindowHandle();
        System.out.println("main page id is "+MainId);
        
        Set <String> SubId = driver.getWindowHandles();
        System.out.println("sub ids are "+SubId);
        
        Iterator <String> i = SubId.iterator();
        String PreviewIndex = i.next();
        
        String SubPage = i.next();
        
        driver.switchTo().window(SubPage);
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[text()='Cypress'][1]")).click();
        Thread.sleep(2000); 
        
        driver.switchTo().window(MainId);
        Thread.sleep(2000);
        
        driver.navigate().refresh();
	}

}
