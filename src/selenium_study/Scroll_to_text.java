package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_to_text {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
         WebElement refElement = driver.findElement(By.xpath("//h2[text()='Up to 70% off | Clearance store']"));
         JavascriptExecutor t = ((JavascriptExecutor)driver);
         
         t.executeScript("arguments[0].scrollIntoView();",refElement);
         System.out.println(refElement.getText());
        
        
	}

}
