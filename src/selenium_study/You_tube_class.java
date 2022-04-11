package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class You_tube_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
   	 Thread.sleep(200);
   	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("make you mine");
   	 Thread.sleep(200);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
       
        
	}

}
