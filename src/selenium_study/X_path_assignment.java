package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.instagram.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Log In']"));
        Thread.sleep(1000);
        WebElement UserId= driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        Thread.sleep(1000);
        WebElement PassWord= driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        Thread.sleep(1000);
        
         boolean StatusLogInButton = LoginButton.isEnabled();

        if(StatusLogInButton) {
        	
        	LoginButton.click();
        	System.out.println("button is alredy clicked");
        }
        else {
        	
        	System.out.println("button is disabled");
        }
        
   
        
        UserId.click();
        Thread.sleep(2000);
        UserId.sendKeys("saket_2502");
        Thread.sleep(2000);
        
        PassWord.click();
        Thread.sleep(2000);
        PassWord.sendKeys("Tech@2515");
        Thread.sleep(2000);
        LoginButton.click();
	}

}
