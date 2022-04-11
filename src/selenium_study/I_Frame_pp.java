package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_pp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(2000);

	}

}
