package selenium_study;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positions_sel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        JavascriptExecutor j = ((JavascriptExecutor)driver);
        Thread.sleep(2000);
        
        j.executeScript("window.scrollBy(0,999)");
        Thread.sleep(2000);
        
        j.executeScript("window.scrollBy(0,-500)");
        

	}

}
