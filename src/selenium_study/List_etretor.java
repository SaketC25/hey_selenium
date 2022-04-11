package selenium_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_etretor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\java notepad\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Thread.sleep(2000);
        
        System.out.println("Number of total links "+links);
      
      for(WebElement w :links) {
    	 System.out.println(w.getText()); 
      }
	}

}
