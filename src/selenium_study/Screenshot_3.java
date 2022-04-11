package selenium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
        driver.manage().window().maximize();
        
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File destintion = new File("C:\\Users\\saket choursiya\\Desktop\\java\\automation\\screenshot\\sstt.png");
        
        FileHandler.copy(source, destintion);
	}

}
