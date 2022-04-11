package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mytechfocus.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement Dropdown = driver.findElement(By.linkText("Courses"));
        Thread.sleep(1000);
        Dropdown.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='UI/UX']")).click();
        Thread.sleep(1000);
	}

}
