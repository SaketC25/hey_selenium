package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_by_text {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4Ar-exJAGwAIB0gIkNWVjMTk1YWItY2QzYi00ZTBkLTk4MzktNDZhYTY5ZTcyMzgy2AIF4AIB;sid=3e4a9ce018300c589d85d0bd235ea77a;keep_landing=1&sb_price_type=total&");
         Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("goa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-mode='checkin']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@aria-label='22 February 2022']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@aria-label='22 March 2022']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='0 children']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Increase number of Children']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='age']")).sendKeys("6 years old");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='xp__button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-placeholder='Check-out date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@aria-label='20 March 2022']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        
        
        
	}

}
