package selaniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
	    WebElement option = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
	    Thread.sleep(2000);
	    
	    Select s = new Select(option);
	    
	    s.selectByVisibleText("Amazon Fashion");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(2000);
	    
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
	    
		
		

	}

}
