package selaniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicite_wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.discoveryplus.in/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
        driver.findElement(By.className("//button[@type='submit']"));

	}

}
