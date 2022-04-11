package selaniumNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_all {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> RdioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("number of total radion butto is:" +RdioButtons.size());
		
         for(WebElement w :RdioButtons) {
        	 w.click();
         }
         
         List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
         System.out.println("number of total radion butto is:" +Checkbox.size());
         
         for( WebElement c: Checkbox) {
        	 Thread.sleep(2000);
        	 c.click();
         }
	}

}
