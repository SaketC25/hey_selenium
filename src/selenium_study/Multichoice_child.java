package selenium_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multichoice_child {

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
        
        Set <String> subIds = driver.getWindowHandles();
        System.out.println("subids are "+subIds);
        
        Iterator <String> i = subIds.iterator();
        String CurrentPage = i.next();
        String Subpage = i.next();
        
        driver.switchTo().window(Subpage);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement searchBarofChildpage = driver.findElement(By.xpath("//input[@id='the7-search']"));
		Thread.sleep(2000);
		searchBarofChildpage.sendKeys("java");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(MainId);
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
