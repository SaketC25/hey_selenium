package selaniumNew;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Hingoli");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		

	}

}
