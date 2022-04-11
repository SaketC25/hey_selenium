package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://suryamangal.com/");
        Thread.sleep(2000);
        
        driver.switchTo().frame("//iframe[@class='vide']");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
        Thread.sleep(2000);

	}

}
