package selaniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		Thread.sleep(2000);
		
		driver.navigate().to("http://automationpractice.com/index.php?id_category=5&controller=category");
		Thread.sleep(2000);
		
		WebElement Option = driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		
		Select s = new Select(Option);
		s.deselectByValue("------Top Metropolitan Cities------");
		Thread.sleep(2000);
		

	}

}
