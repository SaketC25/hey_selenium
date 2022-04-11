package selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\java notepad\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		String alertText = alt.getText();
		System.out.println("Text is "+alertText);
		
		alt.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
				
	}

}
