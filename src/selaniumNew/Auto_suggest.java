package selaniumNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j69i59j69i60l3j69i65.4666j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		
		

	}

}
