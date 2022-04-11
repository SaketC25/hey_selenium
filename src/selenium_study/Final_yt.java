package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Final_yt {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("iktara");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//a[@title='Iktara  - Wake Up Sid | [slowed + reverb] | Textaudio']")).click();

	}

}
