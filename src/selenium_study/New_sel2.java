package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_sel2 {

	public static void main(String[] args) throws InterruptedException {
		
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.youtube.com/");
		   	    Thread.sleep(1000);
		   	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("make you mine");
		   	    Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//a[@title='PUBLIC - Make You Mine (Put Your Hand in Mine) [Official Video]']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
		        Thread.sleep(1000);
		        
	}

}
