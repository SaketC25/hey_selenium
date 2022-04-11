package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_class_sel {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("iktara");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//a[@title='Iktara Full Video - Wake Up Sid|Ranbir Kapoor,Konkona Sen Sharma|Kavita Seth|Amit Trivedi']")).click();
	}

}
