package selenium_study;

import org.openqa.selenium.By;                                 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fcebook_cr_ac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Sign up for Facebook")).click();
        Thread.sleep(1000);
        WebElement listBox = driver.findElement(By.xpath("//select[@aria-label='Day']"));
        Thread.sleep(1000);
        Select d = new Select(listBox);
        d.selectByValue("25");
        Thread.sleep(1000);
        WebElement monthBox = driver.findElement(By.xpath("//select[@aria-label='Month']"));
        Thread.sleep(1000);
        Select m = new Select(monthBox);
        m.selectByVisibleText("Mar");
        Thread.sleep(1000);
        WebElement yearBox = driver.findElement(By.xpath("//select[@aria-label='Year']"));
        Thread.sleep(1000);
        Select y = new Select(yearBox);
        y.selectByValue("2021");
        Thread.sleep(1000);
	}

}
