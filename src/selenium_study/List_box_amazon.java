package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ref=nav_logo");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement dropdn =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Thread.sleep(2000);
        
        Select s = new Select(dropdn);
        
        s.selectByVisibleText("Beauty");
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
