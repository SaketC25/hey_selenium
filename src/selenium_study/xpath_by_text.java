package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text {

	    public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://tectigonitsolutions.com/");
        
        Thread.sleep(1000);
        
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//a[text()='ABOUT US']")).click();
        
        driver.get("https://tectigonitsolutions.com/");

        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//h1[contains(text(),'Website Development Company')]")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//h1[contains(text(),'Website Development Company')]")).click();
        
        Thread.sleep(1000);
        
        

	}

}
