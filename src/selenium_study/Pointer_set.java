package selenium_study;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pointer_set {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
        
        //driver.manage().window().maximize();
        Thread.sleep(2000);
        
        Point p = new Point(190, 200);
        
        driver.manage().window().setPosition(p);
        
        System.out.println(driver.manage().window().getPosition());
        
        driver.close();
	}

}
