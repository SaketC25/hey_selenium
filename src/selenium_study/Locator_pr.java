package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
           
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.youtube.com/");
           driver.findElement(By.xpath("//input[@id='search']")).sendKeys("doobey");
           driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
           driver.findElement(By.xpath("//img[@id='img']")).click();          
	}

}
